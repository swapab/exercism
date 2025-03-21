// Package weather provides the current weather information
// for a given city and current condition.
package weather

// CurrentCondition contains the
// weather conditions at a given point in time.
var CurrentCondition string

// CurrentLocation contains the city name
// for which weather conditions can be provided.
var CurrentLocation string

// Forecast function concats the
// given city and currebt weather conditions.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
