package com.code.autoservice.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class AuctionInfo implements Parcelable {


        @SerializedName("bids")
        @Expose
        private Integer bids;
        @SerializedName("endDate")
        @Expose
        private Integer endDate;
        @SerializedName("endDateEn")
        @Expose
        private String endDateEn;
        @SerializedName("endDateAr")
        @Expose
        private String endDateAr;
        @SerializedName("currencyEn")
        @Expose
        private String currencyEn;
        @SerializedName("currencyAr")
        @Expose
        private String currencyAr;
        @SerializedName("currentPrice")
        @Expose
        private Integer currentPrice;
        @SerializedName("minIncrement")
        @Expose
        private Integer minIncrement;
        @SerializedName("lot")
        @Expose
        private Integer lot;
        @SerializedName("priority")
        @Expose
        private Integer priority;
        @SerializedName("VATPercent")
        @Expose
        private Integer vATPercent;
        @SerializedName("itemAuctionType")
        @Expose
        private Integer itemAuctionType;
        @SerializedName("isModified")
        @Expose
        private Integer isModified;
        @SerializedName("itemid")
        @Expose
        private Integer itemid;
        @SerializedName("iCarId")
        @Expose
        private Integer iCarId;
        @SerializedName("iVinNumber")
        @Expose
        private String iVinNumber;

        protected AuctionInfo(Parcel in) {
            if (in.readByte() == 0) {
                bids = null;
            } else {
                bids = in.readInt();
            }
            if (in.readByte() == 0) {
                endDate = null;
            } else {
                endDate = in.readInt();
            }
            endDateEn = in.readString();
            endDateAr = in.readString();
            currencyEn = in.readString();
            currencyAr = in.readString();
            if (in.readByte() == 0) {
                currentPrice = null;
            } else {
                currentPrice = in.readInt();
            }
            if (in.readByte() == 0) {
                minIncrement = null;
            } else {
                minIncrement = in.readInt();
            }
            if (in.readByte() == 0) {
                lot = null;
            } else {
                lot = in.readInt();
            }
            if (in.readByte() == 0) {
                priority = null;
            } else {
                priority = in.readInt();
            }
            if (in.readByte() == 0) {
                vATPercent = null;
            } else {
                vATPercent = in.readInt();
            }
            if (in.readByte() == 0) {
                itemAuctionType = null;
            } else {
                itemAuctionType = in.readInt();
            }
            if (in.readByte() == 0) {
                isModified = null;
            } else {
                isModified = in.readInt();
            }
            if (in.readByte() == 0) {
                itemid = null;
            } else {
                itemid = in.readInt();
            }
            if (in.readByte() == 0) {
                iCarId = null;
            } else {
                iCarId = in.readInt();
            }
            iVinNumber = in.readString();
        }

        public static final Creator<AuctionInfo> CREATOR = new Creator<AuctionInfo>() {
            @Override
            public AuctionInfo createFromParcel(Parcel in) {
                return new AuctionInfo(in);
            }

            @Override
            public AuctionInfo[] newArray(int size) {
                return new AuctionInfo[size];
            }
        };

        public Integer getBids() {
            return bids;
        }

        public void setBids(Integer bids) {
            this.bids = bids;
        }

        public Integer getEndDate() {
            return endDate;
        }

        public void setEndDate(Integer endDate) {
            this.endDate = endDate;
        }

        public String getEndDateEn() {
            return endDateEn;
        }

        public void setEndDateEn(String endDateEn) {
            this.endDateEn = endDateEn;
        }

        public String getEndDateAr() {
            return endDateAr;
        }

        public void setEndDateAr(String endDateAr) {
            this.endDateAr = endDateAr;
        }

        public String getCurrencyEn() {
            return currencyEn;
        }

        public void setCurrencyEn(String currencyEn) {
            this.currencyEn = currencyEn;
        }

        public String getCurrencyAr() {
            return currencyAr;
        }

        public void setCurrencyAr(String currencyAr) {
            this.currencyAr = currencyAr;
        }

        public Integer getCurrentPrice() {
            return currentPrice;
        }

        public void setCurrentPrice(Integer currentPrice) {
            this.currentPrice = currentPrice;
        }

        public Integer getMinIncrement() {
            return minIncrement;
        }

        public void setMinIncrement(Integer minIncrement) {
            this.minIncrement = minIncrement;
        }

        public Integer getLot() {
            return lot;
        }

        public void setLot(Integer lot) {
            this.lot = lot;
        }

        public Integer getPriority() {
            return priority;
        }

        public void setPriority(Integer priority) {
            this.priority = priority;
        }

        public Integer getVATPercent() {
            return vATPercent;
        }

        public void setVATPercent(Integer vATPercent) {
            this.vATPercent = vATPercent;
        }

        public Integer getItemAuctionType() {
            return itemAuctionType;
        }

        public void setItemAuctionType(Integer itemAuctionType) {
            this.itemAuctionType = itemAuctionType;
        }

        public Integer getIsModified() {
            return isModified;
        }

        public void setIsModified(Integer isModified) {
            this.isModified = isModified;
        }

        public Integer getItemid() {
            return itemid;
        }

        public void setItemid(Integer itemid) {
            this.itemid = itemid;
        }

        public Integer getICarId() {
            return iCarId;
        }

        public void setICarId(Integer iCarId) {
            this.iCarId = iCarId;
        }

        public String getIVinNumber() {
            return iVinNumber;
        }

        public void setIVinNumber(String iVinNumber) {
            this.iVinNumber = iVinNumber;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest , int flags) {
            if (bids == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(bids);
            }
            if (endDate == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(endDate);
            }
            dest.writeString(endDateEn);
            dest.writeString(endDateAr);
            dest.writeString(currencyEn);
            dest.writeString(currencyAr);
            if (currentPrice == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(currentPrice);
            }
            if (minIncrement == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(minIncrement);
            }
            if (lot == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(lot);
            }
            if (priority == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(priority);
            }
            if (vATPercent == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(vATPercent);
            }
            if (itemAuctionType == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(itemAuctionType);
            }
            if (isModified == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(isModified);
            }
            if (itemid == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(itemid);
            }
            if (iCarId == null) {
                dest.writeByte((byte) 0);
            } else {
                dest.writeByte((byte) 1);
                dest.writeInt(iCarId);
            }
            dest.writeString(iVinNumber);
        }
    }




