import { Layout, theme, Typography } from 'antd';

export const HomePage = () => {
  const {
    token: { colorBgContainer, borderRadiusLG },
  } = theme.useToken();
  return <Layout className={colorBgContainer} style={{ borderRadius: borderRadiusLG }}>
      <Typography.Title>
        首页
      </Typography.Title>
  </Layout>
};