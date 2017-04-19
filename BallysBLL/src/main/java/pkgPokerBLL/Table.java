package pkgPokerBLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table implements Serializable {

	private UUID TableID;
	private String PlayerName;
	private int iPlayerPostion;
	private int iPokerID;

	// Change this from ArrayList to HashMap.
	private HashMap<UUID, Player> hmPlayer = new HashMap<UUID, Player>();

	public Table() {
		super();
		TableID = UUID.randomUUID();
	}

	public Table AddPlayerToTable(Player p) {
		hmPlayer.put(p.getPlayerID(), p);
		return this;
	}

	public Table RemovePlayerFromTable(Player p) {
		hmPlayer.replace(p.getPlayerID(), p);
		return this;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getiPlayerPostion() {
		return iPlayerPostion;
	}

	public void setiPlayerPostion(int iPlayerPostion) {
		this.iPlayerPostion = iPlayerPostion;
	}

	public int getiPokerID() {
		return iPokerID;
	}

	public void setiPokerID(int iPokerID) {
		this.iPokerID = iPokerID;
	}

	public HashMap<UUID, Player> getHmPlayer() {
		return hmPlayer;
	}

	public void setHmPlayer(HashMap<UUID, Player> hmPlayer) {
		this.hmPlayer = hmPlayer;
	}
}
