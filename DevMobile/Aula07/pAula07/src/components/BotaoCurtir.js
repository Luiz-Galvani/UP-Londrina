import { Button } from "react-native";

export default function BotaoCurtir({nomePost,aoPressionar}){
    return(
        <Button 
            title="Curtir"
            color="#00fd15"
            onPress={() => aoPressionar(nomePost)}
        />
    )
}