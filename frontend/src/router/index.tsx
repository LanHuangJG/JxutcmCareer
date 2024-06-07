import {createBrowserRouter} from "react-router-dom";
import {LoginPage} from "../page/auth/LoginPage.tsx";
import {RegisterPage} from "../page/auth/RegisterPage.tsx";
import {MainPage} from "../page/MainPage.tsx";
import {HomePage} from "../page/home/HomePage.tsx";

const router = createBrowserRouter([
    {
        path: "/login",
        element: <LoginPage/>,
    },
    {
        path: "/register",
        element: <RegisterPage/>
    },
    {
        path: "/",
        element: <MainPage/>,
        children: [
            {
                path: "/",
                element: <HomePage/>
            }
        ]
    }
]);
export default router;