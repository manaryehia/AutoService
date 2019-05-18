package com.code.autoservice.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;




    public class CarsOnline implements Parcelable {


        @SerializedName("alertEn")
        @Expose
        private String alertEn;
        @SerializedName("alertAr")
        @Expose
        private String alertAr;
        @SerializedName("Error")
        @Expose
        private Error error;
        @SerializedName("RefreshInterval")
        @Expose
        private Integer refreshInterval;
        @SerializedName("Ticks")
        @Expose
        private String ticks;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("endDate")
        @Expose
        private Integer endDate;
        @SerializedName("sortOption")
        @Expose
        private String sortOption;
        @SerializedName("sortDirection")
        @Expose
        private String sortDirection;
        @SerializedName("Cars")
        @Expose
        private List<Car> cars = null;

        protected CarsOnline(Parcel in) {
            alertEn = in.readString();
            alertAr = in.readString();
            if (in.readByte() == 0) {
                refreshInterval = null;
            } else {
                refreshInterval = in.readInt();
            }
            ticks = in.readString();
            if (in.readByte() == 0) {
                count = null;
            } else {
                count = in.readInt();
            }
            if (in.readByte() == 0) {
                endDate = null;
            } else {
                endDate = in.readInt();
            }
            sortOption = in.readString();
            sortDirection = in.readString();
            cars = in.createTypedArrayList(Car.CREATOR);
        }

        public static final Creator<CarsOnline> CREATOR = new Creator<CarsOnline>() {
            @Override
            public CarsOnline createFromParcel(Parcel in) {
                return new CarsOnline(in);
            }

            @Override
            public CarsOnline[] newArray(int size) {
                return new CarsOnline[size];
            }
        };

        public String getAlertEn() {
            return alertEn;
        }

        public void setAlertEn(String alertEn) {
            this.alertEn = alertEn;
        }

        public String getAlertAr() {
            return alertAr;
        }

        public void setAlertAr(String alertAr) {
            this.alertAr = alertAr;
        }

        public Error getError() {
            return error;
        }

        public void setError(Error error) {
            this.error = error;
        }

        public Integer getRefreshInterval() {
            return refreshInterval;
        }

        public void setRefreshInterval(Integer refreshInterval) {
            this.refreshInterval = refreshInterval;
        }

        public String getTicks() {
            return ticks;
        }

        public void setTicks(String ticks) {
            this.ticks = ticks;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getEndDate() {
            return endDate;
        }

        public void setEndDate(Integer endDate) {
            this.endDate = endDate;
        }

        public String getSortOption() {
            return sortOption;
        }

        public void setSortOption(String sortOption) {
            this.sortOption = sortOption;
        }

        public String getSortDirection() {
            return sortDirection;
        }

        public void setSortDirection(String sortDirection) {
            this.sortDirection = sortDirection;
        }

        public List<Car> getCars() {
            return cars;
        }

        public void setCars(List<Car> cars) {
            this.cars = cars;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest , int flags) {
            dest.writeString(alertEn);
            dest.writeString(alertAr);
            if (refreshInterval == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(refreshInterval);
            }
            dest.writeString(ticks);
            if (count == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(count);
            }
            if (endDate == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(endDate);
            }
            dest.writeString(sortOption);
            dest.writeString(sortDirection);
            dest.writeTypedList(cars);
        }
    }



