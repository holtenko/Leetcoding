import React from 'react';
import ComponentCreator from '@docusaurus/ComponentCreator';

export default [
  {
    path: '/blog',
    component: ComponentCreator('/blog', 'edd'),
    exact: true
  },
  {
    path: '/blog/archive',
    component: ComponentCreator('/blog/archive', '361'),
    exact: true
  },
  {
    path: '/blog/first-blog-post',
    component: ComponentCreator('/blog/first-blog-post', '7a9'),
    exact: true
  },
  {
    path: '/blog/long-blog-post',
    component: ComponentCreator('/blog/long-blog-post', 'b2f'),
    exact: true
  },
  {
    path: '/blog/mdx-blog-post',
    component: ComponentCreator('/blog/mdx-blog-post', 'e05'),
    exact: true
  },
  {
    path: '/blog/tags',
    component: ComponentCreator('/blog/tags', '4bf'),
    exact: true
  },
  {
    path: '/blog/tags/docusaurus',
    component: ComponentCreator('/blog/tags/docusaurus', '491'),
    exact: true
  },
  {
    path: '/blog/tags/facebook',
    component: ComponentCreator('/blog/tags/facebook', '7e0'),
    exact: true
  },
  {
    path: '/blog/tags/hello',
    component: ComponentCreator('/blog/tags/hello', '44b'),
    exact: true
  },
  {
    path: '/blog/tags/hola',
    component: ComponentCreator('/blog/tags/hola', '980'),
    exact: true
  },
  {
    path: '/blog/welcome',
    component: ComponentCreator('/blog/welcome', 'a23'),
    exact: true
  },
  {
    path: '/markdown-page',
    component: ComponentCreator('/markdown-page', '763'),
    exact: true
  },
  {
    path: '/docs',
    component: ComponentCreator('/docs', '000'),
    routes: [
      {
        path: '/docs/array/two-sum',
        component: ComponentCreator('/docs/array/two-sum', '3e1'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/backtracking/num1',
        component: ComponentCreator('/docs/backtracking/num1', '943'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/BFS/num1',
        component: ComponentCreator('/docs/BFS/num1', '16a'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/binary-indexed-tree/num1',
        component: ComponentCreator('/docs/binary-indexed-tree/num1', '855'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/binary-search/num1',
        component: ComponentCreator('/docs/binary-search/num1', '822'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/bit-manipulation/num1',
        component: ComponentCreator('/docs/bit-manipulation/num1', 'fea'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/array',
        component: ComponentCreator('/docs/category/array', '819'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/backtracking',
        component: ComponentCreator('/docs/category/backtracking', '6e0'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/bfs',
        component: ComponentCreator('/docs/category/bfs', '501'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/binary-indexed-tree',
        component: ComponentCreator('/docs/category/binary-indexed-tree', 'ee9'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/binary-search',
        component: ComponentCreator('/docs/category/binary-search', '721'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/bit-manipulation',
        component: ComponentCreator('/docs/category/bit-manipulation', '943'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/dfs',
        component: ComponentCreator('/docs/category/dfs', 'a1f'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/dynamic-programing',
        component: ComponentCreator('/docs/category/dynamic-programing', '8cc'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/hashtable',
        component: ComponentCreator('/docs/category/hashtable', '7df'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/linked-list',
        component: ComponentCreator('/docs/category/linked-list', '116'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/math',
        component: ComponentCreator('/docs/category/math', '55d'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/segmant-tree',
        component: ComponentCreator('/docs/category/segmant-tree', '869'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/sort',
        component: ComponentCreator('/docs/category/sort', '790'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/sort-1',
        component: ComponentCreator('/docs/category/sort-1', 'd78'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/stack',
        component: ComponentCreator('/docs/category/stack', '7ad'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/string',
        component: ComponentCreator('/docs/category/string', '9f8'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/tree',
        component: ComponentCreator('/docs/category/tree', '876'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/two-pointers',
        component: ComponentCreator('/docs/category/two-pointers', '0de'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/category/union-find',
        component: ComponentCreator('/docs/category/union-find', 'b52'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/dashboard',
        component: ComponentCreator('/docs/dashboard', 'af9'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/DFS/num1',
        component: ComponentCreator('/docs/DFS/num1', '167'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/dynamic-programing/num1',
        component: ComponentCreator('/docs/dynamic-programing/num1', '867'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/hashtable/num1',
        component: ComponentCreator('/docs/hashtable/num1', '356'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/linked-list/num1',
        component: ComponentCreator('/docs/linked-list/num1', 'dae'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/math/num1',
        component: ComponentCreator('/docs/math/num1', '2b0'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/segmant-tree/num1',
        component: ComponentCreator('/docs/segmant-tree/num1', 'fb8'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/sliding-window/num1',
        component: ComponentCreator('/docs/sliding-window/num1', '4a7'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/sort/num1',
        component: ComponentCreator('/docs/sort/num1', '185'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/stack/num1',
        component: ComponentCreator('/docs/stack/num1', 'b6d'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/string/num1',
        component: ComponentCreator('/docs/string/num1', 'fd5'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/tree/num1',
        component: ComponentCreator('/docs/tree/num1', '16a'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/two-pointers/num1',
        component: ComponentCreator('/docs/two-pointers/num1', 'a82'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/docs/union-find/num1',
        component: ComponentCreator('/docs/union-find/num1', '640'),
        exact: true,
        sidebar: "tutorialSidebar"
      }
    ]
  },
  {
    path: '/',
    component: ComponentCreator('/', '0dd'),
    exact: true
  },
  {
    path: '*',
    component: ComponentCreator('*'),
  },
];
