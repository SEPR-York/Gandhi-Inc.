package me.gandhiinc.test;

import java.util.List;

/**
*
*
**/

public class Player 
{
	private int money;
	private int ore;
	private int energy;

	private List<Roboticon> roboticons;
	private List<Plot> plots;

	public void AquirePlot(Plot plot)
	{
		return;
	}

	public void BuyRoboticon(MarketPlace market, Roboticon roboticon)
	{
		return;
	}

	public void SpecialiseRoboticon(Roboticon roboticon)
	{
		return;
	}

	public void ProduceResources()
	{
		return;
	}

	public void BuyResource(MarketPlace market, Resource resource, int amount)
	{
		return;
	}

	public void SellResource(MarketPlace market, Resource resource, int amount)
	{
		return;
	}

	public int getMoney()
	{
		return money;
	}

	public int getOre()
	{
		return ore;
	}

	public int getEnergy()
	{
		return energy;
	}

	public void setMoney(int money) 
	{
		this.money = money;
	}

	public void setOre(int ore) 
	{
		this.ore = ore;
	}

	public void setEnergy(int energy) 
	{
		this.energy = energy;
	}

	public List<Roboticon> getRoboticons() 
	{
		return roboticons;
	}

	public void setRoboticons(List<Roboticon> roboticons) 
	{
		this.roboticons = roboticons;
	}
	

} 