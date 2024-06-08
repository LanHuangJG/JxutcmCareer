import { Layout, Menu, MenuProps } from 'antd';
import { Content, Header } from 'antd/es/layout/layout';
import { Outlet } from 'react-router-dom';
import { HomeOutlined, UserOutlined } from '@ant-design/icons';
import Sider from 'antd/es/layout/Sider';

export const MainPage = () => {
  type MenuItem = Required<MenuProps>['items'][number];

  const items: MenuItem[] = [
    {
      key: 'home',
      label: '主页',
      icon: <HomeOutlined />,
    },
    {
      key: 'user',
      label: '用户管理',
      icon: <UserOutlined />,
      children: [
        {
          key: 'info',
          label: '信息管理',
          type: 'group',
          children: [
            { key: '1', label: 'Option 1' },
            { key: '2', label: 'Option 2' },
          ],
        },
        {
          key: 'g2',
          label: 'Item 2',
          type: 'group',
          children: [
            { key: '3', label: 'Option 3' },
            { key: '4', label: 'Option 4' },
          ],
        },
      ],
    },
  ];
  const onClick: MenuProps['onClick'] = (e) => {
    console.log('click ', e);
  };
  return <Layout className={'h-full'}>
    <Header color={"white"}>

    </Header>
    <Layout>
      <Sider theme={'light'} width={256} title={"江中生涯"} collapsible about={"aaaaaaaaaa"}>
        <Menu
          onClick={onClick}
          defaultSelectedKeys={['1']}
          defaultOpenKeys={['sub1']}
          mode="inline"
          items={items}
        />
      </Sider>
      <Content>
        <Outlet />
      </Content>
    </Layout>
  </Layout>;
};