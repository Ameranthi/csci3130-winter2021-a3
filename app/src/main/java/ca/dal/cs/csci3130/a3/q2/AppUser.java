package ca.dal.cs.csci3130.a3.q2;

public interface AppUser {

    AccessLevel getUserRole();

    AccessLevel getAccessLevel();

    boolean canPlaceOnlineOrder(AccessLevel accessLevel);

    boolean canPlaceOnlineAd(AccessLevel accessLevel);

    boolean hasAdminAccess(AccessLevel accessLevel);

}
