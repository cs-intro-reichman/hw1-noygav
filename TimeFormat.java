// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args)
	{
		String[] arg = args[0].split(":");
		int hours = Integer.parseInt(arg[0]);
		int minutes = Integer.parseInt(arg[1]);
	
		String period = "AM";
		if (hours >= 12) {
			period = "PM";
		}
		if (hours > 12) {
			hours -= 12;
		}

		System.out.println(hours + ":" + String.format("%02d", minutes) + " " + period);
	}
}