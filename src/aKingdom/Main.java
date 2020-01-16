package aKingdom;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<AnimalAbs> animalList = new ArrayList<AnimalAbs>();
		 animalList.add( new Mammals("Panda", 1869));
		 animalList.add( new Mammals("Zebra", 1778));
		 animalList.add( new Mammals("Koala", 1816));
		 animalList.add( new Mammals("Sloth", 1804));
		 animalList.add( new Mammals("Armadillo", 1758));
		 animalList.add( new Mammals("Raccoon", 1758));
		 animalList.add( new Mammals("Bigfoot", 2021));

		 animalList.add(new Birds("Pigeon", 1837));
		 animalList.add(new Birds("Peacock", 1821));
		 animalList.add(new Birds("Toucan", 1758));
		 animalList.add(new Birds("Parrot", 1824));
		 animalList.add(new Birds("Swan", 1758));

		 animalList.add(new Fish("Salmon", 1758));
		 animalList.add(new Fish("Catfish", 1817));
		 animalList.add(new Fish("Perch", 1758));

		 ArrayList<AnimalAbs> sortedList = new ArrayList<AnimalAbs>();
		 sortedList.addAll(animalList);

		 sortedList.sort((v1, v2) -> {
			 if (v1.year == v2.year)
			 {
				 return v1.name.compareToIgnoreCase(v2.name);
			 } else if (v1.year < v2.year)
			 {
				 return -1;
			 }else {
				 return 1;
			 }
		 });

		 System.out.println("Descending Year \n");
		 sortedList.forEach((v) -> {
			 System.out.println("Name: " + v.name + " , " + "Year: " + v.year);
		 });

		 System.out.println(" ");
		 sortedList.sort((v1, v2) -> v1.name.compareToIgnoreCase(v2.name));

		 System.out.println("Alphabetically by name \n");
		 sortedList.forEach((v) -> {
			 System.out.println("Name: " + v.name + " , " + "Year: " + v.year);
		 });

		
	}
}
