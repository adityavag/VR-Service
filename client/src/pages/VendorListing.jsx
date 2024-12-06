import React, { useEffect, useState } from "react";
import axios from "axios";
import VendorCard from "../components/VendorCard";
const VendorListing = () => {
    const [vendors, setVendors] = useState([]);
    useEffect(() => {
        axios
            .get("http://localhost:8080/api/vendors/")
            .then((res) => {
                setVendors(res.data);
                console.log(vendors[0])
            })
            .catch((error) => { console.log(error) });
    }, []);

    const getFacilitiesList = (vendor) => {
        const facilitiesList = [];
        if (vendor.isEVChargerAvailable) facilitiesList.push("EV Charger");
        if (vendor.isParkingAvailable) facilitiesList.push("Parking");
        if (vendor.isPlayAreaForKidsAvailable) facilitiesList.push("Kids Play Area");
        if (vendor.isSeparateWashroomsAvailable) facilitiesList.push("Separate Washrooms");
        if (vendor.isSmokingZoneAvailable) facilitiesList.push("Smoking Zone");
        if (vendor.isTwentyFourHourOpen) facilitiesList.push("24 Hour Open");
        if (vendor.isVegOnly) facilitiesList.push("Veg Only");
        if (vendor.isWiFiAvailable) facilitiesList.push("Wi-Fi Available");
        return facilitiesList;

    }
    return (
        <div className="bg-gray-100 min-h-screen p-6">
            <div className="grid grid-cols-1 md:grid-cols-3">
                {vendors.map((vendor) => {
                    const facilitiesList = getFacilitiesList(vendor);
                    return(
                        <VendorCard
                        key={vendor.vendorKey}
                        vendorName={vendor.vendorName}
                        ownerName={vendor.ownerName}
                        ownerPhoneNumber={vendor.ownerPhoneNumber}
                        contactPersonName={vendor.contactPersonName}
                        contactPersonPhoneNumber={vendor.contactPersonPhoneNumber}
                        isVegOnly={vendor.isVegOnly}
                        facilities={facilitiesList}
                    />
                    )
                })}
            </div>
        </div>
    )
}

export default VendorListing;
