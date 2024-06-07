import {Layout} from "antd";
import {Content, Header} from "antd/es/layout/layout";
import {Outlet} from "react-router-dom";

export const MainPage = () => {

    return <Layout className={"h-full"}>
        <Header className={"p-0 bg-zinc-50 ml-4"}>
            MainPage
        </Header>
        <Content>
            <Outlet/>
        </Content>
    </Layout>
}