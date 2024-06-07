import {Flex, Layout} from "antd";
import {Header} from "antd/es/layout/layout";

export const LoginPage = () => {

    return <Layout>
        <Header className={"p-0"}>
            <Flex align={"center"} className={"h-full"}>
                <div className={"text-base text-white"}>
                    江中生涯
                </div>
            </Flex>
        </Header>
    </Layout>
}

