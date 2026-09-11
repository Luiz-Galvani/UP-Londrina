import {
  StyleSheet,
  TouchableOpacity,
  View,
  Text,
} from "react-native";
import { Feather } from "@expo/vector-icons";

const ICONES = [
  { id: 1, nome: "folder-plus", descricao: "Entradas" },
  { id: 2, nome: "tag", descricao: "Categorias" },
  { id: 3, nome: "credit-card", descricao: "Cartão" },
  { id: 5, nome: "calendar", descricao: "Agenda" },
  { id: 6, nome: "activity", descricao: "Atividade" },
];

export default function Actions() {
  return (
    <View style={estilos.container}>
      <View style={estilos.linha}>
        {ICONES.map((item) => (
          <TouchableOpacity
            key={item.id}
            style={estilos.acao}
          >
            <View style={estilos.iconeCirculo}>
              <Feather
                name={item.nome}
                size={25}
                color="#014404"
              />
            </View>

            <Text style={estilos.labelButton}>
              {item.descricao}
            </Text>
          </TouchableOpacity>
        ))}
      </View>
    </View>
  );
}

const estilos = StyleSheet.create({
  container: {
    width: "100%",
    paddingHorizontal: 14,
  },

  linha: {
    width: "100%",
    height: 84,

    flexDirection: "row",
    alignItems: "center",
    justifyContent: "space-around",

    backgroundColor: '#adadad',
    borderRadius: 10,
    paddingHorizontal: 10,
  },

  acao: {
    alignItems: "center",
    justifyContent: "center",
  },

  iconeCirculo: {
    width: 44,
    height: 44,
    borderRadius: 22,

    backgroundColor: "#cccaca",

    alignItems: "center",
    justifyContent: "center",
  },

  labelButton: {
    marginTop: 5,
    textAlign: "center",
    color: "#000",
    fontSize: 12,
  },
});
