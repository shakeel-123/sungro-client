package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import sungro.api.Repo;

import java.io.IOException;

public class Router {
    private final Repo repo;
    private final Scene scene;

    private final Layout layout;
    private final Parent layoutRoot;
    private final UserListing userListing;
    private final Parent userListingRoot;
    private final UserInfo userInfo;
    private final Parent userInfoRoot;
    private final UserAdding userAdding;
    private final Parent userAddingRoot;
    private final UserEditing userEditing;
    private final Parent userEditingRoot;
    private final Profile profile;
    private final Parent profileRoot;
    
    public Router(Repo repo) throws IOException {
        this.repo = repo;

        layout = new Layout(this);
        FXMLLoader layoutLoader = new FXMLLoader(getClass().getResource("Layout.fxml"));
        layoutLoader.setController(layout);
        layoutRoot = layoutLoader.load();

        userListing = new UserListing(this);
        FXMLLoader userListingLoader = new FXMLLoader(getClass().getResource("UserListing.fxml"));
        userListingLoader.setController(userListing);
        userListingRoot = userListingLoader.load();

        userInfo = new UserInfo(this);
        FXMLLoader userInfoLoader = new FXMLLoader(getClass().getResource("UserInfo.fxml"));
        userInfoLoader.setController(userInfo);
        userInfoRoot = userInfoLoader.load();

        userAdding = new UserAdding(this);
        FXMLLoader userAddingLoader = new FXMLLoader(getClass().getResource("UserAdding.fxml"));
        userAddingLoader.setController(userAdding);
        userAddingRoot = userAddingLoader.load();

        userEditing = new UserEditing(this);
        FXMLLoader userEditingLoader = new FXMLLoader(getClass().getResource("UserEditing.fxml"));
        userEditingLoader.setController(userEditing);
        userEditingRoot = userEditingLoader.load();

        profile = new Profile(this);
        FXMLLoader profileLoader = new FXMLLoader(getClass().getResource("Profile.fxml"));
        profileLoader.setController(profile);
        profileRoot = profileLoader.load();

        layout.addNode(userListingRoot);
        layout.addNode(userInfoRoot);
        layout.addNode(userAddingRoot);
        layout.addNode(userEditingRoot);
        layout.addNode(profileRoot);


        scene = new Scene(layoutRoot);
        scene.getStylesheets().add("app.css");
    }

    public Repo getRepo() {
        return repo;
    }

    public Scene getScene() {
        return scene;
    }

    public Layout getLayout() {
        return layout;
    }

    public Parent getLayoutRoot() {
        return layoutRoot;
    }

    public UserListing getUserListing() {
        return userListing;
    }

    public Parent getUserListingRoot() {
        return userListingRoot;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public Parent getUserInfoRoot() {
        return userInfoRoot;
    }

    public UserAdding getUserAdding() {
        return userAdding;
    }

    public Parent getUserAddingRoot() {
        return userAddingRoot;
    }

    public UserEditing getUserEditing() {
        return userEditing;
    }

    public Parent getUserEditingRoot() {
        return userEditingRoot;
    }

    public Profile getProfile() {
        return profile;
    }

    public Parent getProfileRoot() {
        return profileRoot;
    }
}
