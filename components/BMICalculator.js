import React from "react";
import { StyleSheet, Text, TextInput, View } from "react-native";

export default function BMICalculator() {
  const [height, setHeight] = React.useState(null);
  const [weight, setWeight] = React.useState(null);
  const [bmi, setBmi] = React.useState(null);

  React.useEffect(() => {
    if (height && weight) {
      const h = Number.parseFloat(height) / 100;
      const w = Number.parseFloat(weight);
      setBmi(w / (h * h));
    }
  }, [height, weight]);

  return (
    <View style={styles.container}>
      <View style={styles.innerContainer}>
        <View style={{ flex: 1 }}>
          <Text style={{ fontSize: 20, textAlign: "center" }}>Height: </Text>
        </View>
        <TextInput
          value={height}
          onChangeText={setHeight}
          placeholder="Height"
          keyboardType="numeric"
          style={{ flex: 1, fontSize: 20 }}
        />
      </View>

      <View style={styles.innerContainer}>
        <View style={{ flex: 1 }}>
          <Text style={{ fontSize: 20, textAlign: "center" }}>Weight: </Text>
        </View>
        <TextInput
          value={weight}
          onChangeText={setWeight}
          placeholder="Weight"
          keyboardType="numeric"
          style={{ flex: 1, fontSize: 20 }}
        />
      </View>

      {bmi && (
        <View>
          <Text style={{ marginTop: 20, textAlign: "center", fontSize: 20 }}>
            BMI is {bmi}
          </Text>
        </View>
      )}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    width: "100%",
  },

  innerContainer: {
    marginTop: 20,
    flexDirection: "row",
    justifyContent: "space-around",
  },
});
