import axios from "axios";
import { Phone, User } from "lucide-react";
import { useNavigate } from "react-router-dom";

const VendorCard = (props) => {
    const navigate = useNavigate();
    const deleteVendor = async (key) => {
        // console.log(key);
        await axios.delete(`http://localhost:8080/api/vendors/delete/${key}`);
        window.location.reload();
    }

    const updateVendor = async (key) => {
        navigate(`/edit/${key}`);
    }
    const facilities = props.facilities;
    return (
        <div className="bg-white p-4 rounded-md shadow-md space-y-1.5">
            <div className="font-semibold text-2xl">{props.vendorName}</div>
            <div className="font-semibold">Owner's Details</div>
            <div className="flex gap-2"><User/>{props.ownerName}</div>
            <div className="flex gap-2"><Phone/>{props.ownerPhoneNumber}</div>
            <div className="font-semibold">Contact Person's Details</div>
            <div className="flex gap-2"><User/>{props.contactPersonName}</div>
            <div className="flex gap-2"><Phone/>{props.contactPersonPhoneNumber}</div>
            {/* <div className="font-semibold">Facilities</div> */}
            {/* <div className="grid grid-cols-2 md:grid-cols-3 gap-3">
            {facilities.map((facility, index) => (
                    <div key={index} className="bg-gray-200 text-black text-center rounded-full text-sm py-1.5">{facility}</div>
                ))}
            </div> */}
            <div className="flex gap-2">
                <button className="bg-blue-500 text-white py-1.5 px-3 w-[100px] rounded-md mt-6" onClick={() => updateVendor(props.uniqueKey)}>Edit</button>
                <button className="bg-red-500 text-white py-1.5 px-3 w-[100px] rounded-md mt-6" onClick={() => deleteVendor(props.uniqueKey)}>Delete</button>
            </div>
        </div>
    )
}

export default VendorCard;