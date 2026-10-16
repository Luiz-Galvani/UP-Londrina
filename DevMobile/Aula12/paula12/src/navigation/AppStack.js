import {createNativeStackNavigator} from "@react-navigation/native-stack"
import ListaTarefasScreen from "../screens/ListaTarefasScreen"
import NovaTarefaScreen from "../screens/NovaTarefaScreen"


const Stack = createNativeStackNavigator()


export default function AppStack(){
    return(
        <Stack.Navigator>
            <Stack.Screen component={ListaTarefasScreen} name="Tarefas" options={{title:"Minhas Tarefas"}}/>
            <Stack.Screen component={NovaTarefaScreen} name="NovaTarefa" options={{title:"Nova Tarefas"}}/>
        </Stack.Navigator>
    )
}