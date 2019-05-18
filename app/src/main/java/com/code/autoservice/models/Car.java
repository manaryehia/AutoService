package com.code.autoservice.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


    public class Car implements Parcelable {


        @SerializedName("carID")
        @Expose
        private Integer carID;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("descriptionAr")
        @Expose
        private String descriptionAr;
        @SerializedName("descriptionEn")
        @Expose
        private String descriptionEn;
        @SerializedName("imgCount")
        @Expose
        private Integer imgCount;
        @SerializedName("sharingLink")
        @Expose
        private String sharingLink;
        @SerializedName("sharingMsgEn")
        @Expose
        private String sharingMsgEn;
        @SerializedName("sharingMsgAr")
        @Expose
        private String sharingMsgAr;
        @SerializedName("mileage")
        @Expose
        private String mileage;
        @SerializedName("makeID")
        @Expose
        private Integer makeID;
        @SerializedName("modelID")
        @Expose
        private Integer modelID;
        @SerializedName("bodyId")
        @Expose
        private Integer bodyId;
        @SerializedName("year")
        @Expose
        private Integer year;
        @SerializedName("makeEn")
        @Expose
        private String makeEn;
        @SerializedName("makeAr")
        @Expose
        private String makeAr;
        @SerializedName("modelEn")
        @Expose
        private String modelEn;
        @SerializedName("modelAr")
        @Expose
        private String modelAr;
        @SerializedName("bodyEn")
        @Expose
        private String bodyEn;
        @SerializedName("bodyAr")
        @Expose
        private String bodyAr;
        @SerializedName("AuctionInfo")
        @Expose
        public AuctionInfo auctionInfo;

        protected Car(Parcel in) {
            if (in.readByte() == 0) {
                carID = null;
            } else {
                carID = in.readInt();
            }
            image = in.readString();
            descriptionAr = in.readString();
            descriptionEn = in.readString();
            if (in.readByte() == 0) {
                imgCount = null;
            } else {
                imgCount = in.readInt();
            }
            sharingLink = in.readString();
            sharingMsgEn = in.readString();
            sharingMsgAr = in.readString();
            mileage = in.readString();
            if (in.readByte() == 0) {
                makeID = null;
            } else {
                makeID = in.readInt();
            }
            if (in.readByte() == 0) {
                modelID = null;
            } else {
                modelID = in.readInt();
            }
            if (in.readByte() == 0) {
                bodyId = null;
            } else {
                bodyId = in.readInt();
            }
            if (in.readByte() == 0) {
                year = null;
            } else {
                year = in.readInt();
            }
            makeEn = in.readString();
            makeAr = in.readString();
            modelEn = in.readString();
            modelAr = in.readString();
            bodyEn = in.readString();
            bodyAr = in.readString();
            auctionInfo = in.readParcelable(AuctionInfo.class.getClassLoader());
        }

        public static final Creator<Car> CREATOR = new Creator<Car>() {
            @Override
            public Car createFromParcel(Parcel in) {
                return new Car(in);
            }

            @Override
            public Car[] newArray(int size) {
                return new Car[size];
            }
        };

        public Integer getCarID() {
            return carID;
        }

        public void setCarID(Integer carID) {
            this.carID = carID;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getDescriptionAr() {
            return descriptionAr;
        }

        public void setDescriptionAr(String descriptionAr) {
            this.descriptionAr = descriptionAr;
        }

        public String getDescriptionEn() {
            return descriptionEn;
        }

        public void setDescriptionEn(String descriptionEn) {
            this.descriptionEn = descriptionEn;
        }

        public Integer getImgCount() {
            return imgCount;
        }

        public void setImgCount(Integer imgCount) {
            this.imgCount = imgCount;
        }

        public String getSharingLink() {
            return sharingLink;
        }

        public void setSharingLink(String sharingLink) {
            this.sharingLink = sharingLink;
        }

        public String getSharingMsgEn() {
            return sharingMsgEn;
        }

        public void setSharingMsgEn(String sharingMsgEn) {
            this.sharingMsgEn = sharingMsgEn;
        }

        public String getSharingMsgAr() {
            return sharingMsgAr;
        }

        public void setSharingMsgAr(String sharingMsgAr) {
            this.sharingMsgAr = sharingMsgAr;
        }

        public String getMileage() {
            return mileage;
        }

        public void setMileage(String mileage) {
            this.mileage = mileage;
        }

        public Integer getMakeID() {
            return makeID;
        }

        public void setMakeID(Integer makeID) {
            this.makeID = makeID;
        }

        public Integer getModelID() {
            return modelID;
        }

        public void setModelID(Integer modelID) {
            this.modelID = modelID;
        }

        public Integer getBodyId() {
            return bodyId;
        }

        public void setBodyId(Integer bodyId) {
            this.bodyId = bodyId;
        }

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getMakeEn() {
            return makeEn;
        }

        public void setMakeEn(String makeEn) {
            this.makeEn = makeEn;
        }

        public String getMakeAr() {
            return makeAr;
        }

        public void setMakeAr(String makeAr) {
            this.makeAr = makeAr;
        }

        public String getModelEn() {
            return modelEn;
        }

        public void setModelEn(String modelEn) {
            this.modelEn = modelEn;
        }

        public String getModelAr() {
            return modelAr;
        }

        public void setModelAr(String modelAr) {
            this.modelAr = modelAr;
        }

        public String getBodyEn() {
            return bodyEn;
        }

        public void setBodyEn(String bodyEn) {
            this.bodyEn = bodyEn;
        }

        public String getBodyAr() {
            return bodyAr;
        }

        public void setBodyAr(String bodyAr) {
            this.bodyAr = bodyAr;
        }

        public AuctionInfo getAuctionInfo() {
            return auctionInfo;
        }

        public void setAuctionInfo(AuctionInfo auctionInfo) {
            this.auctionInfo = auctionInfo;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest , int flags) {
            if (carID == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(carID);
            }
            dest.writeString(image);
            dest.writeString(descriptionAr);
            dest.writeString(descriptionEn);
            if (imgCount == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(imgCount);
            }
            dest.writeString(sharingLink);
            dest.writeString(sharingMsgEn);
            dest.writeString(sharingMsgAr);
            dest.writeString(mileage);
            if (makeID == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(makeID);
            }
            if (modelID == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(modelID);
            }
            if (bodyId == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(bodyId);
            }
            if (year == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(year);
            }
            dest.writeString(makeEn);
            dest.writeString(makeAr);
            dest.writeString(modelEn);
            dest.writeString(modelAr);
            dest.writeString(bodyEn);
            dest.writeString(bodyAr);
            dest.writeParcelable(auctionInfo , flags);
        }
    }


