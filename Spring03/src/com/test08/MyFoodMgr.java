package com.test08;

public class MyFoodMgr {

	private Food favoriteFood;
	private Food unfavoriteFood;

	public MyFoodMgr() {
		favoriteFood = new Food();
		favoriteFood.setName("김치찌개");
		favoriteFood.setPrice(7000);
	}

	public MyFoodMgr(Food favoriteFood, Food unfavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unfavoriteFood = unfavoriteFood;
	}

	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public Food getUnfavoriteFood() {
		return unfavoriteFood;
	}

	public void setUnfavoriteFood(Food unfavoriteFood) {
		this.unfavoriteFood = unfavoriteFood;
	}

	@Override
	public String toString() {
		return "favoriteFood : " + favoriteFood + ", unfavoriteFood : " + unfavoriteFood;
	}

}
