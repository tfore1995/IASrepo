package foreman;

import java.util.ArrayList;

public class Entity 
{
	int hp;
	int speed;
	int heat_tolerance;
	int cold_tolerance;
	int max_weight;
	
	ArrayList<Inventory> inventory_space;
	ArrayList<Skill> skills;
	
	//rules
	// every 2 points of weight, speed goes down by 1
	// for every speed poitn, you can swim one grid
	// when you swim over your speed, you drown
}
