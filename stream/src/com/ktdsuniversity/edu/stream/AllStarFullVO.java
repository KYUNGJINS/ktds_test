package com.ktdsuniversity.edu.stream;

public class AllStarFullVO {

	private String playerID;
	private String year;
	private int gameNum;
	private String gameID;
	private String TeamID;
	private String lgID;
	private int gp;
	private int startingPos;
	
	public String getTeamID() {
		return TeamID;
	}
	
	public void setTeamID(String teamID) {
		TeamID = teamID;
	}

	public String getPlayerID() {
		return playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getGameNum() {
		return gameNum;
	}

	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
	}

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public String getLgID() {
		return lgID;
	}

	public void setLgID(String lgID) {
		this.lgID = lgID;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public int getStartingPos() {
		return startingPos;
	}

	public void setStartingPos(int startingPos) {
		this.startingPos = startingPos;
	}

}
