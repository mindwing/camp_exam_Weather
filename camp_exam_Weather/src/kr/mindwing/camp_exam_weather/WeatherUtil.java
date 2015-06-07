package kr.mindwing.camp_exam_weather;

public class WeatherUtil {

	static class WeatherInfo {
		String location;
		String weatherInfo;

		int[] mainImage = new int[5];
		String[] mainTemerature = new String[5];

		String[] rain = new String[5];
		String[] humidity = new String[5];
		String[] wind = new String[5];

		String[] outlineWeek = new String[5];
		int[] outlineImage = new int[5];
		String[] outlineTemperature = new String[5];
	}

	public static WeatherInfo getCurrentInfo() {
		WeatherInfo retVal = new WeatherInfo();

		getherLocation(retVal);
		getherWeatherInfo(retVal);

		getherMainInfos(retVal);

		getherRain(retVal);
		getherHumidity(retVal);
		getherWind(retVal);

		getherOutline(0, retVal);
		getherOutline(1, retVal);
		getherOutline(2, retVal);
		getherOutline(3, retVal);
		getherOutline(4, retVal);

		return retVal;
	}

	private static void getherLocation(WeatherInfo weatherInfo) {
		weatherInfo.location = "서울특별시 강남구 신사동";
	}

	private static void getherWeatherInfo(WeatherInfo weatherInfo) {
		weatherInfo.weatherInfo = "토 오후 1시 대체로 맑음";
	}

	private static void getherMainInfos(WeatherInfo weatherInfo) {
		weatherInfo.mainImage[0] = R.drawable.weather_01;
		weatherInfo.mainImage[1] = R.drawable.weather_02;
		weatherInfo.mainImage[2] = R.drawable.weather_03;
		weatherInfo.mainImage[3] = R.drawable.weather_04;
		weatherInfo.mainImage[4] = R.drawable.weather_05;

		weatherInfo.mainTemerature[0] = "25";
		weatherInfo.mainTemerature[1] = "24";
		weatherInfo.mainTemerature[2] = "23";
		weatherInfo.mainTemerature[3] = "22";
		weatherInfo.mainTemerature[4] = "21";
	}

	private static void getherRain(WeatherInfo weatherInfo) {
		weatherInfo.rain[0] = "강수확률: 0%";
		weatherInfo.rain[1] = "강수확률: 2%";
		weatherInfo.rain[2] = "강수확률: 4%";
		weatherInfo.rain[3] = "강수확률: 6%";
		weatherInfo.rain[4] = "강수확률: 8%";
	}

	private static void getherHumidity(WeatherInfo weatherInfo) {
		weatherInfo.humidity[0] = "습도: 30%";
		weatherInfo.humidity[1] = "습도: 30%";
		weatherInfo.humidity[2] = "습도: 40%";
		weatherInfo.humidity[3] = "습도: 40%";
		weatherInfo.humidity[4] = "습도: 50%";
	}

	private static void getherWind(WeatherInfo weatherInfo) {
		weatherInfo.wind[0] = "풍속: 1m/s";
		weatherInfo.wind[1] = "풍속: 3m/s";
		weatherInfo.wind[2] = "풍속: 5m/s";
		weatherInfo.wind[3] = "풍속: 7m/s";
		weatherInfo.wind[4] = "풍속: 9m/s";
	}

	private static void getherOutline(int index, WeatherInfo weatherInfo) {
		switch (index) {
		case 0:
			weatherInfo.outlineWeek[index] = "월";
			weatherInfo.outlineImage[0] = R.drawable.weather_06;
			weatherInfo.outlineTemperature[0] = "26°C";

			break;

		case 1:
			weatherInfo.outlineWeek[index] = "화";
			weatherInfo.outlineImage[0] = R.drawable.weather_07;
			weatherInfo.outlineTemperature[1] = "27°C";

			break;

		case 2:
			weatherInfo.outlineWeek[index] = "수";
			weatherInfo.outlineImage[0] = R.drawable.weather_08;
			weatherInfo.outlineTemperature[2] = "24°C";

			break;

		case 3:
			weatherInfo.outlineWeek[index] = "목";
			weatherInfo.outlineImage[0] = R.drawable.weather_09;
			weatherInfo.outlineTemperature[3] = "25°C";

			break;

		case 4:
			weatherInfo.outlineWeek[index] = "금";
			weatherInfo.outlineImage[0] = R.drawable.weather_10;
			weatherInfo.outlineTemperature[4] = "24°C";

			break;

		default:
			weatherInfo.outlineWeek[index] = "??";
			weatherInfo.outlineImage[0] = R.drawable.weather_01;
			weatherInfo.outlineTemperature[4] = "??°C";

			break;
		}
	}
}
