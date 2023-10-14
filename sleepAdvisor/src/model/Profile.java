package model;

//A sleep advisor program. This program will input basic background information from the user for a profile,
//as well as various booleans to determine how their lifestyle practices are effecting their sleep. 
//They will then enter their sleep stage percentages, recorded from their own personal smart accessory, 
//or will use a basic sleep cycle from the average American, but with the users practices in this cycle. 
//The program will then do basic calculations to then display the graph of the predicted sleep stages 
//they were in during the time, as well as what changes need to be done to reach their goal.
/**
* @author Michael Sedykh - masedykh
* CIS175 - Fall 2023
* Sep 15, 2023
*/

//CHANGES BLAH BLAH to test idk

//	TODO
// Imports & Columns

/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Oct 7, 2023
 */

//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="items")
public class Profile {
    private String fullName;
    private String goal;		//	sleepQuality (-core), sleepEfficiency(-onset-fragmentation), memory(deep), health(rem)
    private int height;
    private int weight;			//	obesity: -shortSleep -quality +fragmentation +awakenings 
    private char gender;

    private ExerciseInfo exerciseInfo;
    private DietaryPreferences dietaryPreferences;
    private DietaryChoices dietaryChoices;
    private SubstanceConsumption substanceConsumption;
    private SleepDetails sleepDetails;
    private SleepPatterns sleepPatterns;

    public Profile() {
        // Default constructor
    }

	public String returnProfileStats() {
		return "Profile: " + "\n";
	}

	public String getFullName() {
		return fullName;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public char getGender() {
		return gender;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}

// Grouping related fields into specific categories
class ExerciseInfo {
    private int exercise;
    private int sauna;
    private int cardio;

	int getExercise() {
		return exercise;
	}
	int getSauna() {
		return sauna;
	}
	int getCardio() {
		return cardio;
	}
	
	public void setExercise(int exercise) {
		this.exercise = exercise;
	}
	public void setSauna(int sauna) {
		this.sauna = sauna;
	}
	public void setCardio(int cardio) {
		this.cardio = cardio;
	}
    // Getters and setters
}

class DietaryPreferences {
    private boolean medDiet;	//	-onset +-disruptions
    private boolean dashDiet;	//	-insomnia
    private boolean lowCarb;	//	-onset +efficiency

	public boolean isMedDiet() {
		return medDiet;
	}
	public boolean isDashDiet() {
		return dashDiet;
	}
	public boolean isLowCarb() {
		return lowCarb;
	}
	
	public void setMedDiet(boolean medDiet) {
		this.medDiet = medDiet;
	}
	public void setDashDiet(boolean dashDiet) {
		this.dashDiet = dashDiet;
	}
	public void setLowCarb(boolean lowCarb) {
		this.lowCarb = lowCarb;
	}
    // Getters and setters
}

class DietaryChoices {
    private boolean melatoninFoods;				//	-onset-insomnia +quality
    private boolean serotoninTryptophanFoods;	//	-insomnia +melatonin +sleeptime -onset +quality -disruptions
    private boolean fattyFish;					//	+quality
    private boolean curcumin;					//	+rem
    private boolean milk;						// 	+tryptophan	+melatonin +efficiency -awakenings

	public boolean isMelatoninFoods() {
		return melatoninFoods;
	}
	public boolean isSerotoninTryptophanFoods() {
		return serotoninTryptophanFoods;
	}
	public boolean isFattyFish() {
		return fattyFish;
	}
	public boolean isCurcumin() {
		return curcumin;
	}
	public boolean isMilk() {
		return milk;
	}
	
	public void setMelatoninFoods(boolean melatoninFoods) {
		this.melatoninFoods = melatoninFoods;
	}
	public void setSerotoninTryptophanFoods(boolean serotoninTryptophanFoods) {
		this.serotoninTryptophanFoods = serotoninTryptophanFoods;
	}
	public void setFattyFish(boolean fattyFish) {
		this.fattyFish = fattyFish;
	}
	public void setCurcumin(boolean curcumin) {
		this.curcumin = curcumin;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
    // Getters and setters
}

class SubstanceConsumption {
    private boolean caffeine;	//	-melatonin -efficiency +disruptions +insomnia
    private boolean nicotine;	//	+fragmentation +awakenings
    private boolean alcohol;	//	-quality +onset +fragmentation +awakenings 
    private boolean reflux;		//  -quality +awakenings

	public boolean isCaffeine() {
		return caffeine;
	}
	public boolean isNicotine() {
		return nicotine;
	}
	public boolean isAlcohol() {
		return alcohol;
	}
	public boolean isReflux() {
		return reflux;
	}
	
	public void setCaffeine(boolean caffeine) {
		this.caffeine = caffeine;
	}
	public void setNicotine(boolean nicotine) {
		this.nicotine = nicotine;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	public void setReflux(boolean reflux) {
		this.reflux = reflux;
	}
}

class SleepDetails {
    private int hoursOfSleep;			//	+core
    private int timeOfSleep;			//	+/-deep
    private boolean blueLightUsage;		//	-quality
    private boolean snore;				//	+fragmentation

	public int getHoursOfSleep() {
		return hoursOfSleep;
	}
	public int getTimeOfSleep() {
		return timeOfSleep;
	}
	public boolean isBlueLightUsage() {
		return blueLightUsage;
	}
	public boolean isSnore() {
		return snore;
	}
	
	public void setHoursOfSleep(int hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}
	public void setTimeOfSleep(int timeOfSleep) {
		this.timeOfSleep = timeOfSleep;
	}
	public void setBlueLightUsage(boolean blueLightUsage) {
		this.blueLightUsage = blueLightUsage;
	}
	public void setSnore(boolean snore) {
		this.snore = snore;
	}

}

class SleepPatterns {
    private int[] pattern;

	public void setSleeps(int[] sleeps) {
		this.sleeps = sleeps;
	}
}
