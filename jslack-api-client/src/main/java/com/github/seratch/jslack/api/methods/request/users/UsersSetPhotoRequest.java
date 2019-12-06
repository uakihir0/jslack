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
    private byte[] imageData;

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

    UsersSetPhotoRequest(String token, File image, byte[] imageData, Integer cropX, Integer cropY, Integer cropW) {
        this.token = token;
        this.image = image;
        this.imageData = imageData;
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

    public byte[] getImageData() {
        return this.imageData;
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

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
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

    public static class UsersSetPhotoRequestBuilder {
        private String token;
        private File image;
        private byte[] imageData;
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

        public UsersSetPhotoRequest.UsersSetPhotoRequestBuilder imageData(byte[] imageData) {
            this.imageData = imageData;
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
            return new UsersSetPhotoRequest(token, image, imageData, cropX, cropY, cropW);
        }

        public String toString() {
            return "UsersSetPhotoRequest.UsersSetPhotoRequestBuilder(token=" + this.token + ", image=" + this.image + ", imageData=" + java.util.Arrays.toString(this.imageData) + ", cropX=" + this.cropX + ", cropY=" + this.cropY + ", cropW=" + this.cropW + ")";
        }
    }
}
