import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View ,TouchableOpacity} from 'react-native';
import {useVideoPlayer, VideoView} from 'expo-video'

const fonte = 'https://www.gov.br/pt-br/midias-agorabrasil/video-fundo.mp4';

export default function App() {
  const playerConf = useVideoPlayer(fonte, (p) => {
    p.loop = true
  p.play()
})
  return (
    <View style={styles.container}>
        <TouchableOpacity
          onPress ={() =>{
            playerConf.playing ?
            playerConf.pause() :
            playerConf.play()
          }}
        >
          <VideoView
            style = {{width: '100%', height:'300', borderRadius:25}}
            player={playerConf}
            contentFit='contain'
            nativeControls = {false}
          />
        </TouchableOpacity>
        <TouchableOpacity
          style = {styles.botao}
          onPress ={() =>{
            playerConf.playing ?
            playerConf.pause() :
            playerConf.play()
          }}
        >
          <Text>Tocar</Text>
        </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  botao:{
    backgroundColor:'#dadada',
    padding: 12,
    borderRadius:8,
    marginTop:26
  }
});
