import {SafeAreaProvider } from "react-native-safe-area-context"
import AppStack from "./src/navigation/AppStack"
import { NavigationContainer } from "@react-navigation/native";

export default function App() {
  return (
      <SafeAreaProvider>
        <NavigationContainer>
          <AppStack/>
        </NavigationContainer>
      </SafeAreaProvider>
  );
}

