package org.craftercms.profile.api;

import java.util.Date;

/**
 * Verification token, used for verifying a new profile with the user or for verifying a reset password request.
 *
 * @author avasquez
 */
public class VerificationToken {

    private String _id;
    private String profileId;
    private Date timestamp;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VerificationToken token = (VerificationToken) o;

        if (!_id.equals(token._id)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return _id.hashCode();
    }

    @Override
    public String toString() {
        return "VerificationToken{" +
                "id=" + _id +
                ", profileId='" + profileId + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}
