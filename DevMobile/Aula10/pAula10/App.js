import Home from './src/pages/Home';
import Sobre from './src/pages/Sobre';
import Profile from './src/pages/Profile';

import { NavigationContainer } from '@react-navigation/native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { Feather } from '@expo/vector-icons';

const Tab = createBottomTabNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Tab.Navigator
        screenOptions={({ route }) => ({
          tabBarActiveTintColor: "#118AB2",
          tabBarInactiveTintColor: "#5b5b5b",
          tabBarStyle: { height: 70, paddingBottom: 8 },
          tabBarIcon: ({ color, size }) => {
            const nomeIcone = 
              route.name === "Home" ? 'home' :
              route.name === "Profile" ? 'user' :
              'settings';
            return <Feather name={nomeIcone} size={size} color={color} />;
          }
        })}>
        <Tab.Screen name="Home" options={{ title: 'Inicio' }} component={Home} />
        <Tab.Screen name="Profile" component={Profile} />
        <Tab.Screen name="Sobre" component={Sobre} />
      </Tab.Navigator>
    </NavigationContainer>
  );
}