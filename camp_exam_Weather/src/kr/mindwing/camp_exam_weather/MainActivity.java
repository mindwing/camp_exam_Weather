package kr.mindwing.camp_exam_weather;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	private TextView tvLocation;
	private TextView tvWeatherInfo;

	private ImageView ivMainImage;
	private TextView tvMainTemperature;

	private TextView tvRain;
	private TextView tvHumidity;
	private TextView tvWind;

	private SeekBar sbTime;

	private TextView[] tvOutlineText;
	private ImageView[] ivOutlineImage;
	private TextView[] tvOutlineTemperature;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		assignUIElements();
	}

	private void assignUIElements() {
		tvLocation = (TextView) findViewById(R.id.location_text);
		tvWeatherInfo = (TextView) findViewById(R.id.weather_info_text);

		ivMainImage = (ImageView) findViewById(R.id.main_image);
		tvMainTemperature = (TextView) findViewById(R.id.main_temperature);

		tvRain = (TextView) findViewById(R.id.right_info_rain);
		tvHumidity = (TextView) findViewById(R.id.right_info_humidity);
		tvWind = (TextView) findViewById(R.id.right_info_wind);

		sbTime = (SeekBar) findViewById(R.id.seekbar);
		sbTime.setMax(4);
		sbTime.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				tvMainTemperature.setText(Integer.toString(progress));
			}
		});

		tvOutlineText = new TextView[5];
		tvOutlineText[0] = (TextView) findViewById(R.id.outline_1_text);
		tvOutlineText[1] = (TextView) findViewById(R.id.outline_2_text);
		tvOutlineText[2] = (TextView) findViewById(R.id.outline_3_text);
		tvOutlineText[3] = (TextView) findViewById(R.id.outline_4_text);
		tvOutlineText[4] = (TextView) findViewById(R.id.outline_5_text);

		ivOutlineImage = new ImageView[5];
		ivOutlineImage[0] = (ImageView) findViewById(R.id.outline_1_image);
		ivOutlineImage[1] = (ImageView) findViewById(R.id.outline_2_image);
		ivOutlineImage[2] = (ImageView) findViewById(R.id.outline_3_image);
		ivOutlineImage[3] = (ImageView) findViewById(R.id.outline_4_image);
		ivOutlineImage[4] = (ImageView) findViewById(R.id.outline_5_image);

		tvOutlineTemperature = new TextView[5];
		tvOutlineTemperature[0] = (TextView) findViewById(R.id.outline_1_temperature);
		tvOutlineTemperature[1] = (TextView) findViewById(R.id.outline_2_temperature);
		tvOutlineTemperature[2] = (TextView) findViewById(R.id.outline_3_temperature);
		tvOutlineTemperature[3] = (TextView) findViewById(R.id.outline_4_temperature);
		tvOutlineTemperature[4] = (TextView) findViewById(R.id.outline_5_temperature);
	}
}
