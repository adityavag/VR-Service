import { BrowserRouter, Route, Routes } from "react-router-dom";
import VendorRegistration from "./pages/VendorRegistration";
import VendorListing from "./pages/VendorListing";
import VendorUpdate from "./pages/VendorUpdate";

const App = () => {
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" element = {<VendorListing/>} />
        <Route path="/register" element = {<VendorRegistration/>} />
        <Route path="/edit/:vendorKey" element={<VendorUpdate/>}/>
      </Routes>
    </BrowserRouter>
  )
}

export default App;