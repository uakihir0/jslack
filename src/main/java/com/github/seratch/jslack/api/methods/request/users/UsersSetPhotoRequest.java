package com.github.seratch.jslack.api.methods.request.users;

import com.github.seratch.jslack.api.methods.SlackApiRequest;

import java.io.File;

/**
 * Set the user profile photo
 */
public class UsersSetPhotoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `users.profile:write`
     */
    private String token;

    /**
     * File contents via `multipart/form-data`.
     */
    private File image;

    /**
     * X coordinate of top-left corner of crop box
     */
    private Integer cropX;

    /**
     * Y coordinate of top-left corner of crop box
     */
    private Integer cropY;

    /**
     * Width/height of crop box (always square)
     */
    private Integer cropW;

    @java.beans.ConstructorProperties({"token", "image", "cropX", "cropY", "cropW"})
    UsersSetPhotoRequest(String token, File image, Integer cropX, Integer cropY, Integer cropW) {
        this.token = token;
        this.image = image;
        this.cropX = cropX;
        this.cropY = cropY;
        this.cropW = cropW;
    }

    public static UsersSetPhotoRequestBuilder builder() {
        return new UsersSetPhotoRequestBuilder();
    }

    public String getToken() {
        return this.token;
    }

    public File getImage() {
        return this.image;
    }

    public Integer getCropX() {
        return this.cropX;
    }

    public Integer getCropY() {
        return this.cropY;
    }

    public Integer getCropW() {
        return this.cropW;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public void setCropX(Integer cropX) {
        this.cropX = cropX;
    }

    public void setCropY(Integer cropY) {
        this.cropY = cropY;
    }

    public void setCropW(Integer cropW) {
        this.cropW = cropW;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UsersSetPhotoRequest)) return false;
        final UsersSetPhotoRequest other = (UsersSetPhotoRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$cropX = this.getCropX();
        final Object other$cropX = other.getCropX();
        if (this$cropX == null ? other$cropX != null : !this$cropX.equals(other$cropX)) return false;
        final Object this$cropY = this.getCropY();
        final Object other$cropY = other.getCropY();
        if (this$cropY == null ? other$cropY != null : !this$cropY.equals(other$cropY)) return false;
        final Object this$cropW = this.getCropW();
        final Object other$cropW = other.getCropW();
        if (this$cropW == null ? other$cropW != null : !this$cropW.equals(other$cropW)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UsersSetPhotoRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $cropX = this.getCropX();
        result = result * PRIME + ($cropX == null ? 43 : $cropX.hashCode());
        final Object $cropY = this.getCropY();
        result = result * PRIME + ($cropY == null ? 43 : $cropY.hashCode());
        final Object $cropW = this.getCropW();
        result = result * PRIME + ($cropW == null ? 43 : $cropW.hashCode());
        return result;
    }

    public String toString() {
        return "UsersSetPhotoRequest(token=" + this.getToken() + ", image=" + this.getImage() + ", cropX=" + this.getCropX() + ", cropY=" + this.getCropY() + ", cropW=" + this.getCropW() + ")";
    }

    public static class UsersSetPhotoRequestBuilder {
        private String token;
        private File image;
        private Integer cropX;
        private Integer cropY;
        private Integer cropW;

        UsersSetPhotoRequestBuilder() {
        }

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder token(String token) {
            this.token = token;
            return this;
        }

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder image(File image) {
            this.image = image;
            return this;
        }

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder cropX(Integer cropX) {
            this.cropX = cropX;
            return this;
        }

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder cropY(Integer cropY) {
            this.cropY = cropY;
            return this;
        }

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder cropW(Integer cropW) {
            this.cropW = cropW;
            return this;
        }

        public UsersSetPhotoRequest build() {
            return new UsersSetPhotoRequest(token, image, cropX, cropY, cropW);
        }

        public String toString() {
            return "UsersSetPhotoRequest.UsersSetPhotoRequestBuilder(token=" + this.token + ", image=" + this.image + ", cropX=" + this.cropX + ", cropY=" + this.cropY + ", cropW=" + this.cropW + ")";
        }
    }
}
