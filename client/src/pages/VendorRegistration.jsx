import { useState } from "react";
import { BabyIcon, BatteryChargingIcon, CarrotIcon, CigaretteIcon, Clock, Flag, ParkingCircle, ParkingCircleIcon, PersonStanding, Toilet, ToiletIcon, UtensilsCrossedIcon, Wifi } from "lucide-react";
import axios from "axios";
import Navbar from "../components/Navbar";
const VendorRegistration = () => {
    const [formData, setFormData] = useState({
        vendorKey: "",
        vendorName: "",
        ownerName: "",
        ownerPhoneNumber: "",
        ownerEmail: "",
        contactPersonName: "",
        contactPersonPhoneNumber: "",
        googleMapsLocationLink: "",
        seatingCapacity: "",
        isParkingAvailable: false,
        isEVChargerAvailable: false,
        isWiFiAvailable: false,
        isSmokingZoneAvailable: false,
        isPlayAreaForKidsAvailable: false,
        washroomsAvailable: false,
        totalWashroomCount: "",
        isSeparateWashroomsAvailable: false,
        femaleWashroomCount: "",
        maleWashroomCount: "",
        isVegOnly: false,
        isTwentyFourHourOpen: false,
        openingHours: "",
    });

    const handleChange = (event) => {
        const { id, type, checked, value } = event.target;
        console.log(`${id} Clicked`);

        setFormData((prevData) => ({
            ...prevData,
            [id]: type === 'checkbox' ? checked : value,
            ...(id === 'washroomAvailable' && !checked && { maleWashroomCount: 0, femaleWashroomCount: 0 }),
            ...(id === 'isTwentyFourHourOpen' && {
                openingHours: checked ? "24 Hours" : "",
            }),
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            const res = await axios.post("http://localhost:8080/api/vendors/", formData, {
                headers: {
                    "Content-Type": "application/json",
                }
            });
            alert("Vendor Registered Successfully");
            console.log(res.data);
        } catch (error) {
            console.log(error);
        }
        window.location.reload();
    }

    return (
        <div>
            <Navbar />
            <div className="min-h-screen bg-gray-100 mx-auto p-6 md:p-10">
                <div className="bg-white rounded-md shadow-md p-8 md:w-3/4 mx-auto">
                    <center><UtensilsCrossedIcon /></center>
                    <div className="text-2xl font-semibold text-center mt-4">Register New Vendor</div>
                    <form onSubmit={handleSubmit}>
                        <div className="grid w-full items-center gap-4">
                            {/* Vendor Key */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="vendorKey">Vendor Key</label>
                                <input
                                    id="vendorKey"
                                    className="p-2 border rounded-md"
                                    type="text"
                                    required
                                    placeholder="e.g., VEND1234"
                                    value={formData.vendorKey}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Vendor Name */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="vendorName">Vendor Name</label>
                                <input
                                    id="vendorName"
                                    className="p-2 border rounded-md"
                                    type="text"
                                    required
                                    placeholder="Vendor's Name"
                                    value={formData.vendorName}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Owner Details */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="ownerName">Owner Name</label>
                                <input
                                    id="ownerName"
                                    className="p-2 border rounded-md"
                                    type="text"
                                    required
                                    placeholder="Owner's Name"
                                    value={formData.ownerName}
                                    onChange={handleChange}
                                />
                            </div>
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="ownerPhoneNumber">Owner's Phone Number</label>
                                <input
                                    id="ownerPhoneNumber"
                                    className="p-2 border rounded-md"
                                    type="tel"
                                    required
                                    placeholder="Owner's Phone number"
                                    value={formData.ownerPhoneNumber}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Contact Person Details */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="contactPersonName">Contact Person Name</label>
                                <input
                                    id="contactPersonName"
                                    className="p-2 border rounded-md"
                                    type="text"
                                    required
                                    placeholder="Contact Person's Name"
                                    value={formData.contactPersonName}
                                    onChange={handleChange}
                                />
                            </div>
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="contactPersonPhoneNumber">Contact Person's Phone Number</label>
                                <input
                                    id="contactPersonPhoneNumber"
                                    className="p-2 border rounded-md"
                                    type="tel"
                                    required
                                    placeholder="Contact Person's Phone number"
                                    value={formData.contactPersonPhoneNumber}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Google Maps Link */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="googleMapsLocationLink">Google Maps Link</label>
                                <input
                                    id="googleMapsLocationLink"
                                    className="p-2 border rounded-md"
                                    type="url"
                                    required
                                    placeholder="Pate Google Maps Link Here"
                                    value={formData.googleMapsLocationLink}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Seating Capacity */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="seatingCapacity">Seating Capacity</label>
                                <input
                                    id="seatingCapacity"
                                    className="p-2 border rounded-md"
                                    type="number"
                                    min={0}
                                    required
                                    placeholder="Number of Seats Available"
                                    value={formData.seatingCapacity}
                                    onChange={handleChange}
                                />
                            </div>
                            {/* Opening Hours */}
                            <div className="flex flex-col space-y-1.5">
                                <label htmlFor="isTwentyFourHourOpen" className="flex items-center gap-2">
                                    <input
                                        id="isTwentyFourHourOpen"
                                        type="checkbox"
                                        checked={formData.isTwentyFourHourOpen}
                                        onChange={handleChange}
                                    />
                                    Open 24 Hours
                                </label>
                                {!formData.isTwentyFourHourOpen && (
                                    <div className="flex flex-col space-y-1.5">
                                        <label htmlFor="openingHours">Opening Hours</label>
                                        <input
                                            id="openingHours"
                                            className="p-2 border rounded-md"
                                            type="text"
                                            required
                                            placeholder="e.g., 10:00 AM - 10:00 PM"
                                            value={formData.openingHours}
                                            onChange={handleChange}
                                        />
                                    </div>
                                )}
                            </div>

                            {/*  */}
                            <div className="grid grid-cols-1 md:grid-cols-3 space-y-4">
                                {/* Parking */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isParkingAvailable" className="flex gap-2"><ParkingCircleIcon />Parking Availability</label>
                                    <input
                                        id="isParkingAvailable"
                                        type="checkbox"
                                        checked={formData.isParkingAvailable}
                                        onChange={handleChange}
                                    />
                                </div>
                                {/* EV Charger */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isEVChargerAvailable" className="flex gap-2"><BatteryChargingIcon />EV Charger</label>
                                    <input
                                        id="isEVChargerAvailable"
                                        type="checkbox"
                                        checked={formData.isEVChargerAvailable}
                                        onChange={handleChange}
                                    />
                                </div>
                                {/* Wi-Fi */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isWiFiAvailable" className="flex gap-2"><Wifi />Free Wi-Fi</label>
                                    <input
                                        id="isWiFiAvailable"
                                        type="checkbox"
                                        checked={formData.isWiFiAvailable}
                                        onChange={handleChange}
                                    />
                                </div>
                                {/* Smoking Zone */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isSmokingZoneAvailable" className="flex gap-2"><CigaretteIcon />Smoking Zone</label>
                                    <input
                                        id="isSmokingZoneAvailable"
                                        type="checkbox"
                                        checked={formData.isSmokingZoneAvailable}
                                        onChange={handleChange}
                                    />
                                </div>
                                {/* Play Area */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isPlayAreaForKidsAvailable" className="flex gap-2"><BabyIcon />Child Care Room</label>
                                    <input
                                        id="isPlayAreaForKidsAvailable"
                                        type="checkbox"
                                        checked={formData.isPlayAreaForKidsAvailable}
                                        onChange={handleChange}
                                    />
                                </div>
                                {/* Veg */}
                                <div className="flex items-center space-x-2">
                                    <label htmlFor="isVegOnly" className="flex gap-2"><CarrotIcon />Veg Only</label>
                                    <input
                                        id="isVegOnly"
                                        type="checkbox"
                                        checked={formData.isVegOnly}
                                        onChange={handleChange}
                                    />
                                </div>
                            </div>
                            {/* Washroom */}
                            <div className="flex items-center space-x-2">
                                <label htmlFor="washroomAvailable" className="flex gap-2"><ToiletIcon />Washroom Availability</label>
                                <input
                                    id="washroomAvailable"
                                    type="checkbox"
                                    checked={formData.washroomAvailable}
                                    onChange={handleChange}
                                />
                            </div>

                            {formData.washroomAvailable && (
                                <div className="pl-6 space-y-4">
                                    <div className="flex items-center space-x-2">
                                        <input
                                            id="hasSeparateWashrooms"
                                            type="checkbox"
                                            checked={formData.hasSeparateWashrooms}
                                            onChange={handleChange}
                                        />
                                        <label htmlFor="hasSeparateWashrooms">
                                            Separate Washrooms for Male and Female
                                        </label>
                                    </div>
                                    {formData.hasSeparateWashrooms && (
                                        <div className="space-y-3">
                                            <div className="flex flex-col space-y-1.5">
                                                <label htmlFor="totalWashroomCount">
                                                    Number of Total Washrooms
                                                </label>
                                                <input
                                                    id="totalWashroomCount"
                                                    className="p-2 border rounded-md"
                                                    type="number"
                                                    min="0"
                                                    value={formData.totalWashroomCount}
                                                    onChange={handleChange}
                                                />
                                            </div>
                                            <div className="grid grid-cols-2 gap-4">
                                                <div className="flex flex-col space-y-1.5">
                                                    <label htmlFor="maleWashroomCount">
                                                        Number of Male Washrooms
                                                    </label>
                                                    <input
                                                        id="maleWashroomCount"
                                                        type="number"
                                                        className="p-2 border rounded-md"
                                                        min="0"
                                                        value={formData.maleWashroomCount}
                                                        onChange={handleChange}
                                                    />
                                                </div>
                                                <div className="flex flex-col space-y-1.5">
                                                    <label htmlFor="femaleWashroomCount">
                                                        Number of Female Washrooms
                                                    </label>
                                                    <input
                                                        id="femaleWashroomCount"
                                                        className="p-2 border rounded-md"
                                                        type="number"
                                                        min="0"
                                                        value={formData.femaleWashroomCount}
                                                        onChange={handleChange}
                                                    />
                                                </div>
                                            </div>
                                        </div>
                                    )}
                                </div>)}
                            <div className="flex justify-center mt-4">
                                <button
                                    type="submit"
                                    className="text-white bg-black p-2 text-center rounded-md w-3/4">Register Vendor</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    )
}
export default VendorRegistration;