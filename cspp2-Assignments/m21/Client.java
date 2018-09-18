import java.util.Scanner;
class Food {
	private String foodName;
	private String quantity;
	private String date;
	private String time;
	// private String day;
	Food(String foodName, String quantity, String date, String time) {
		this.foodName = foodName;
		this.quantity = quantity;
		this.time = time;
		this.date = date;
	}
	public String getFoodname() {
		return foodName;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}

	public String foodLog() {
		// System.out.println("Food");
		String s = "Date:"+getDate()+"\n"+"Time:"+getTime()+"\n"+"Name:"+getFoodname()+"\n"+"Quantity:"+getQuantity();
		return s;
	}
}

class Sleep {
	private String startTime;
	private String endTime;
	private String date;

	Sleep(String date,String startTime, String endTime) {
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getstartTime() {
		return startTime;
	}

	public String getendTime() {
		return endTime;
	}

	public String getDate() {
		return date;
	}

	public String SleepLog() {
		// System.out.println("Sleep");
		String s = "Date:"+getDate()+"\n"+"Starttime:"+getstartTime()+"\n"+"Endtime:"+getendTime();
		return s;
	}
}
class Activity {
	private String name;
	private String startTime;
	private String endTime;
	private String notes = "";
	private String date;

	Activity(String name, String startTime, String endTime, String date) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}

	Activity(String name, String notes, String date, String startTime, String endTime) {
		this.name = name;
		this.notes = notes;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;	
	}

	public String getName() {
		return name;
	}
	public String getstartTime() {
		return startTime;
	}
	public String getendTime() {
		return endTime;
	}
	public String getnotes() {
		return notes;
	}
	public String getDate() {
		return date;
	}

	public String ActivityLog() {
		// System.out.println("PhysicalActivity");
		String s = "Name:"+getName()+"\n"+"Notes:"+getnotes()+"\n"+"Date:"+getDate()+"\n"+"Starttime:"+getstartTime()+"\n"+"Endtime:"+getendTime();
		return s;
	}
}
class Water {
	private String consumption;
	private String time;
	private String date;
	Water(String consumption, String date, String time) {
		this.consumption = consumption;
		this.date = date;
		this.time = time;
	}

	public String getConsumption() {
		return consumption;
	}

	public String getTime() {
		return time;
	}

	public String getDate() {
		return date;
	}

	public String WaterLog() {
		// System.out.println("Water2");
		String s = "Date:"+getDate()+"\n"+"Quantity:"+getConsumption()+"ml";
		return s;
	}

	
}
class Weight {
	private String weight;
	private String fat;
	private String date;
	private String time;

	Weight(String date, String time, String weight, String fat) {
		this.date = date;
		this.time = time;
		this.weight = weight;
		this.fat = fat;
		
	}

	public String getWeight() {
		return weight;
	}

	public String getFat() {
		return fat;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public String WeightLog() {
		String s = "Date:"+getDate()+"\n"+"Time:"+getTime()+"\n"+"Weight:"+getWeight()+"\n"+"Fat:"+getFat();
		return s;
	}
}
class Fitbyte {
	private Food[] food;
	private Activity[] act;
	private Water[] water;
	private Sleep[] sleep;
	private Weight[] weight;
	private int foodSize = 0;
	private int actSize = 0;
	private int waterSize = 0;
	private int sleepSize = 0;
	private int weightSize = 0;

	//

	Fitbyte() {
		food = new Food[10];
		act = new Activity[10];
		water = new Water[10];
		sleep = new Sleep[10];
		weight = new Weight[10];
	}

	// Getters
	public Food[] getFood() {
		Food[] f = new Food[foodSize];
		for(int i = 0; i < foodSize; i++) {
			f[i] = food[i];
		}
		return f;
	}
	public Activity[] getActivity() {
		Activity[] ac = new Activity[actSize];
		for(int i = 0; i < actSize; i++) {
			ac[i] = act[i];
		}
		return ac;
	}
	public Water[] getWater() {
		Water[] wa = new Water[waterSize];
		for(int i = 0; i < waterSize; i++) {
			wa[i] = water[i];
		}
		return wa;
	}
	public Sleep[] getSleep() {
		Sleep[] sl = new Sleep[sleepSize];
		for(int i = 0; i < sleepSize; i++) {
			sl[i] = sleep[i];
		}
		return sl;
	}
	public Weight[] getWeight() {
		Weight[] w = new Weight[weightSize];
		for(int i = 0; i < weightSize; i++) {
			w[i] = weight[i];
		}
		return w;
	}
	public int getFoodSize() {
		return foodSize;
	}
	public int getActSize() {
		return actSize;
	}
	public int getWaterSize() {
		return waterSize;
	}
	public int getSleepSize() {
		return sleepSize;
	}
	public int getWeightSize() {
		return weightSize;
	}


	//Methods to add
	public void addFood(Food f) {
		food[foodSize++] = f;
	}
	public void addActivity(Activity a) {
		act[actSize++] = a;
	}
	public void addWater(Water w) {
		water[waterSize++] = w;
	}
	public void addSleep(Sleep s) {
		sleep[sleepSize++] = s;
	}
	public void addWeight(Weight wt) {
		weight[weightSize++] = wt;
	}

}

public final class Client {

	private Client() {

	}
	public static void main(String[] args) {
		Fitbyte fb = new Fitbyte();
		Scanner s = new Scanner(System.in);

		while(s.hasNext()) {
			String line = s.nextLine();
			String[] tokens = line.split(" ");
			// System.out.println(tokens[0]);
			// System.out.println(tokens[1]);
			switch(tokens[0]) {
				case "Food":
				String[] t = tokens[1].split(",");
				Food f = new Food(t[0],t[1],t[2],t[3]);
				fb.addFood(f);
				break;
				case "PhysicalActivity":
				String[] t1 = tokens[1].split(",");
				if(t1.length == 4) {
					Activity a = new Activity(t1[0],t1[1],t1[2],t1[3]);
					fb.addActivity(a);
				} else {
					Activity a = new Activity(t1[0],t1[1],t1[2],t1[3],t1[4]);
					fb.addActivity(a);
				}
				break;
				case "Water":
				String[] t2 = tokens[1].split(",");
				Water w = new Water(t2[0], t2[1], t2[2]);
				fb.addWater(w);
				break;
				case "Weight":
				String[] t3 = tokens[1].split(",");
				Weight wt = new Weight(t3[0],t3[1],t3[2],t3[3]);
				fb.addWeight(wt);
				break;
				case "Sleep":
				String[] t4 = tokens[1].split(",");
				Sleep sl = new Sleep(t4[0],t4[1],t4[2]);
				fb.addSleep(sl);
				break;
				case "Foodlog":
				Food[] fo = fb.getFood();
				System.out.println("Food");
				for(int i = 0; i < fo.length; i++) {
					System.out.print(fo[i].foodLog());					
				}
				System.out.println("\n");
				break;
				case "Waterlog":
				Water[] wa = fb.getWater();
				System.out.println("Water");
				for(int i = 0; i < wa.length; i++) {
					// String poo = wa[i].WaterLog();
					// System.out.println(poo);
					System.out.print(wa[i].WaterLog());
					System.out.println();
				}
				System.out.println();
				break;
				case "PhysicalActivitylog":
				Activity[] ac = fb.getActivity();
				System.out.println("PhysicalActivity");
				if(ac.length == 0){
					System.out.println("None");
					// return;
				}
				else{
					for(int i = 0; i < ac.length; i++) {
						System.out.print(ac[i].ActivityLog());
						System.out.println();
					}
				}
				System.out.println();
				break;
				case "Sleeplog":
				Sleep[] sle = fb.getSleep();
				System.out.println("Sleep");
				for(int i = 0; i < sle.length; i++) {
					System.out.print(sle[i].SleepLog());
				}
				System.out.println("\n");
				break;
				case "Weightlog":
				Weight[] wei = fb.getWeight();
				System.out.println("Weight");
				for(int i = 0; i < wei.length; i++) {
					System.out.print(wei[i].WeightLog());
				}
				System.out.println("\n");
				break;
				case "Summary":
				// System.out.println(tokens[2]);
				if(tokens.length == 1) {
					Food[] fo2 = fb.getFood();
					System.out.println("Food");
					for(int i = 0; i < fo2.length; i++) {
						System.out.print(fo2[i].foodLog());					
					}
					System.out.println();
					Water[] wa2 = fb.getWater();
					System.out.println("Water");
					for(int i = 0; i < wa2.length; i++) {
						System.out.print(wa2[i].WaterLog());
					}
					System.out.println();
					Activity[] ac2 = fb.getActivity();
					System.out.println("PhysicalActivity");
					if(ac2.length == 0){
						System.out.print("None");
						// return;
					}
					else {
						for(int i = 0; i < ac2.length; i++) {
							System.out.print(ac2[i].ActivityLog());
						}
					}
					System.out.println();
					Weight[] wei2 = fb.getWeight();
					System.out.println("Weight");
					for(int i = 0; i < wei2.length; i++) {
						System.out.print(wei2[i].WeightLog());
					}
					System.out.println();
					Sleep[] sle2 = fb.getSleep();
					System.out.println("Sleep");
					for(int i = 0; i < sle2.length; i++) {
						System.out.print(sle2[i].SleepLog());
					}
					System.out.println();
				}
				// System.out.println("hi");
				else {
					String date1 = tokens[1];
					// System.out.println(date1);
					Food[] fo1 = fb.getFood();
					Water[] wa1 = fb.getWater();
					Activity[] ac1 = fb.getActivity();
					Sleep[] sle1 = fb.getSleep();
					Weight[] wei1 = fb.getWeight();
					for(Food foods : fo1) {
						// System.out.println(foods.getDate());
						if(foods.getDate().equals(date1)) {
							// System.out.println("kk");
							System.out.println(foods.foodLog());
						}
					}
					System.out.println();
					for(Water waters : wa1) {
						if(waters.getDate().equals(date1)) {
							System.out.println(waters.WaterLog());
						}
					}
					for(Activity acti : ac1) {
						if(acti.getDate().equals(date1)) {
							System.out.println(acti.ActivityLog());
						}
					}
					for(Sleep slee : sle1) {
						if(slee.getDate().equals(date1)) {
							System.out.println(slee.SleepLog());
						}
					}
					for(Weight wts : wei1) {
						if(wts.getDate().equals(date1)) {
							System.out.println(wts.WeightLog());
						}
					}
				}
				break;
			}
		}
	}
}
