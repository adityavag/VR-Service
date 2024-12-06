import { BrowserRouter, Route, Routes } from "react-router-dom";
import VendorRegistration from "./pages/VendorRegistration";

const App = () => {
  return(
    <BrowserRouter>
      <Routes>
        <Route path="/" element = {<VendorRegistration/>} />
      </Routes>
    </BrowserRouter>
  )
}

export default App;