	public class Main extends Activity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			Button B = (Button) findViewById(R.id.test);
			B.setOnClickListener(new OnClickListener() {
			    public void onClick(View arg0) {
					Intent i = new Intent(this, result.class);
					i.putExtra("test",0);
					startActivity(i);
				}
			}
		}
		
	}
