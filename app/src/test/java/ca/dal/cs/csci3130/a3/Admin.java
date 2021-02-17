package ca.dal.cs.csci3130.a3;
import ca.dal.cs.csci3130.a3.q2.AccessLevel;
import ca.dal.cs.csci3130.a3.q2.AppUser;

    public class Admin implements AppUser {
        @Override
        public AccessLevel getUserRole() {
            AccessLevel role = new AccessLevel("admin");
            return role;
        }

        @Override
        public AccessLevel getAccessLevel() {
            AccessLevel level = new AccessLevel("admin");
            return level;
        }

        @Override
        public boolean canPlaceOnlineOrder(AccessLevel accessLevel) {
            return true;
        }

        @Override
        public boolean canPlaceOnlineAd(AccessLevel accessLevel) {
            return true;
        }

        @Override
        public boolean hasAdminAccess(AccessLevel accessLevel) {
            return true;
        }
    }

