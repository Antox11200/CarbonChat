package fr.carbonchat.software.core.swinger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javafx.scene.image.Image;

public class User {

	public static final int STATUS_OFFLINE = -1;
	public static final int STATUS_INACTIVE = 0;
	public static final int STATUS_DO_NOT_DISTURB = 1;
	public static final int STATUS_ONLINE = 2;

	public static final int SOCIAL_NETWORK_FACEBOOK = 1;
	public static final int SOCIAL_NETWORK_TWITTER = 2;
	public static final int SOCIAL_NETWORK_YOUTUBE = 1;
	public static final int SOCIAL_NETWORK_GITHUB = 3;
	
	public String id;

	public User(int id) {

	}

	public String getUsername() {
		return "user - " + new Random().nextInt(999999);
	}

	public List<Project> getProjects() {
		ArrayList<Project> projects = new ArrayList<>();
		projects.add(new Project(0, "CarbonChat"));
		projects.add(new Project(0, "iPvP"));
		projects.add(new Project(0, "BloostryNetwork"));

		return projects;
	}

	public Image getLogo(int width, int height) {
		Image image = new Image(getClass().getResourceAsStream("/imgs/carbonchat-logo.png"), width, height, true, true);
		return image;
	}
	
	public List<Ad> getUserAds() {
		ArrayList<Ad> ad = new ArrayList<>();
		ad.add(new Ad(0));
		ad.add(new Ad(0));
		ad.add(new Ad(0));
		ad.add(new Ad(0));

		return ad;
	}
	
	public String getSocialNetwork(int social_network_type) {
		if(social_network_type == SOCIAL_NETWORK_TWITTER) {
			return "@ImUserOnAir";
		}
		return "Im User' On Air";
	}
	
	public String getDescription() {
		return "Le Lorem Ipsum est simplement du faux texte employ� dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les ann�es 1500, quand un imprimeur anonyme assembla ensemble des morceaux de texte pour r�aliser un livre sp�cimen de polices de texte. Il n'a pas fait que survivre cinq si�cles, mais s'est aussi adapt� � la bureautique informatique, sans que son contenu n'en soit modifi�. Il a �t� popularis� dans les ann�es 1960 gr�ce � la vente de feuilles Letraset contenant des passages du Lorem Ipsum, et, plus r�cemment, par son inclusion dans des applications de mise en page de texte, comme Aldus PageMaker.";
	}
	
	public int getStatus() {
		return STATUS_ONLINE;
	}
}
