import { StatusBar } from "expo-status-bar";
import { SafeAreaView, StyleSheet, Text } from "react-native";
import BMICalculator from "./components/BMICalculator";

export default function App() {
  return (
    <SafeAreaView style={styles.container}>
      <Text style={styles.heading}>BMI Calculator</Text>
      <BMICalculator />
      <StatusBar style="auto" />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
  },
  heading: {
    fontSize: 32,
    fontWeight: "500",
  },
});
