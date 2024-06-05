import {createBrowserRouter} from "react-router-dom";
import {LoginPage} from "../page/auth/LoginPage.tsx";

const router = createBrowserRouter([
    {
        path: "/",
        element: <LoginPage/>,
    },
]);
export default router;