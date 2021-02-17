package ca.dal.cs.csci3130.a3.q2;

public class Seller implements AppUser {
    @Override
    public AccessLevel getUserRole() {
        AccessLevel role = new AccessLevel("seller");
        return role;
    }

    @Override
    public AccessLevel getAccessLevel() {
        AccessLevel level = new AccessLevel("seller");
        return level;
    }

    @Override
    public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
        return false;
    }

    @Override
    public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
        return true;
    }

    @Override
    public boolean hasAdminAccess(AccessLevel accessLevel) {
        return false;
    }
}
