import { BrowserRouter, Route, Routes } from "react-router-dom";
import VendorRegistration from "./pages/VendorRegistration";
import VendorListing from "./pages/VendorListing";

const App = () => {
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" element = {<VendorListing/>} />
        <Route path="/register" element = {<VendorRegistration/>} />
      </Routes>
    </BrowserRouter>
  )
}

export default App;