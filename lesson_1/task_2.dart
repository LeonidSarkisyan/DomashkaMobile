double celsiusToFahrenheit(double celsius) {
  const absoluteZero = -273.15;

  if (celsius < absoluteZero) {
    throw ArgumentError("Температура не может быть ниже абсолютного нуля (-273.15°C)");
  }

  return celsius * 9 / 5 + 32;
}

void main() {
  try {
    double celsius = -300;
    double fahrenheit = celsiusToFahrenheit(celsius);
    print("$celsius°C = $fahrenheit°F");
  } catch (e) {
    print(e);
  }
}
