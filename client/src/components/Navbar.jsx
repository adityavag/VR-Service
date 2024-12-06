import { CircleUserRound, Link } from "lucide-react";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Navbar = () => {
    const [open, setOpen] = useState(false);
    const navigate = useNavigate();
    return (
        <div className="bg-white md:p-4 w-full">
            <button onClick={() => setOpen(!open)} className="mb-8">
                <CircleUserRound className="absolute right-5 md:w-40"/>
            </button>
            {open && (
                <div className="absolute right-6 mt-2 md:mt-6 w-56 bg-white rounded-md shadow-lg z-10">
                    <div className="p-4 border-b">
                        <p className="text-sm font-medium">Admin</p>
                        <p className="text-xs text-gray-500">admin@gmail.com</p>
                    </div>
                    <button className="w-full px-4 py-2 text-left text-sm text-gray-700 hover:bg-gray-100" onClick={() => navigate("/register")}>
                        Register Vendor
                    </button>
                    <button className="w-full px-4 py-2 text-left text-sm text-gray-700 hover:bg-gray-100" onClick={() => navigate("/")}>
                        View Registered Vendors
                    </button>
                </div>
            )}
        </div>
    )
}

export default Navbar;