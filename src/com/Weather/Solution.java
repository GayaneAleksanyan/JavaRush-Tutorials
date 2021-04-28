package com.Weather;

/* 
The weather is fine
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(com.Weather.WeatherType.CLOUDY));
        System.out.println(new Today(com.Weather.WeatherType.FOGGY));
        System.out.println(new Today(com.Weather.WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
