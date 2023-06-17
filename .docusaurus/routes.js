import React from 'react';
import ComponentCreator from '@docusaurus/ComponentCreator';

export default [
  {
    path: '/Leetcoding/__docusaurus/debug',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug', 'fea'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/config',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/config', 'a11'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/content',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/content', '0df'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/globalData',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/globalData', '2b4'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/metadata',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/metadata', '63f'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/registry',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/registry', '425'),
    exact: true
  },
  {
    path: '/Leetcoding/__docusaurus/debug/routes',
    component: ComponentCreator('/Leetcoding/__docusaurus/debug/routes', 'c4e'),
    exact: true
  },
  {
    path: '/Leetcoding/blog',
    component: ComponentCreator('/Leetcoding/blog', 'ef2'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/archive',
    component: ComponentCreator('/Leetcoding/blog/archive', 'd40'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/first-blog-post',
    component: ComponentCreator('/Leetcoding/blog/first-blog-post', '93e'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/long-blog-post',
    component: ComponentCreator('/Leetcoding/blog/long-blog-post', 'aff'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/mdx-blog-post',
    component: ComponentCreator('/Leetcoding/blog/mdx-blog-post', '7a3'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/tags',
    component: ComponentCreator('/Leetcoding/blog/tags', '16a'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/tags/docusaurus',
    component: ComponentCreator('/Leetcoding/blog/tags/docusaurus', '589'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/tags/facebook',
    component: ComponentCreator('/Leetcoding/blog/tags/facebook', 'bed'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/tags/hello',
    component: ComponentCreator('/Leetcoding/blog/tags/hello', '860'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/tags/hola',
    component: ComponentCreator('/Leetcoding/blog/tags/hola', '4f9'),
    exact: true
  },
  {
    path: '/Leetcoding/blog/welcome',
    component: ComponentCreator('/Leetcoding/blog/welcome', 'c09'),
    exact: true
  },
  {
    path: '/Leetcoding/markdown-page',
    component: ComponentCreator('/Leetcoding/markdown-page', 'b78'),
    exact: true
  },
  {
    path: '/Leetcoding/docs',
    component: ComponentCreator('/Leetcoding/docs', 'db5'),
    routes: [
      {
        path: '/Leetcoding/docs/array/two-sum',
        component: ComponentCreator('/Leetcoding/docs/array/two-sum', '951'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/backtracking/num1',
        component: ComponentCreator('/Leetcoding/docs/backtracking/num1', 'fff'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/BFS/num1',
        component: ComponentCreator('/Leetcoding/docs/BFS/num1', '795'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/binary-indexed-tree/num1',
        component: ComponentCreator('/Leetcoding/docs/binary-indexed-tree/num1', '0af'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/binary-search/num1',
        component: ComponentCreator('/Leetcoding/docs/binary-search/num1', '831'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/bit-manipulation/num1',
        component: ComponentCreator('/Leetcoding/docs/bit-manipulation/num1', 'c7b'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/array',
        component: ComponentCreator('/Leetcoding/docs/category/array', '123'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/backtracking',
        component: ComponentCreator('/Leetcoding/docs/category/backtracking', '9c4'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/bfs',
        component: ComponentCreator('/Leetcoding/docs/category/bfs', '543'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/binary-indexed-tree',
        component: ComponentCreator('/Leetcoding/docs/category/binary-indexed-tree', 'e91'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/binary-search',
        component: ComponentCreator('/Leetcoding/docs/category/binary-search', '1b0'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/bit-manipulation',
        component: ComponentCreator('/Leetcoding/docs/category/bit-manipulation', '053'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/dfs',
        component: ComponentCreator('/Leetcoding/docs/category/dfs', '012'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/dynamic-programing',
        component: ComponentCreator('/Leetcoding/docs/category/dynamic-programing', '165'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/hashtable',
        component: ComponentCreator('/Leetcoding/docs/category/hashtable', 'f1d'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/linked-list',
        component: ComponentCreator('/Leetcoding/docs/category/linked-list', 'c09'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/math',
        component: ComponentCreator('/Leetcoding/docs/category/math', 'f3c'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/segmant-tree',
        component: ComponentCreator('/Leetcoding/docs/category/segmant-tree', '9ad'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/sort',
        component: ComponentCreator('/Leetcoding/docs/category/sort', '1bf'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/sort-1',
        component: ComponentCreator('/Leetcoding/docs/category/sort-1', 'c22'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/stack',
        component: ComponentCreator('/Leetcoding/docs/category/stack', '45b'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/string',
        component: ComponentCreator('/Leetcoding/docs/category/string', 'da3'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/tree',
        component: ComponentCreator('/Leetcoding/docs/category/tree', '596'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/two-pointers',
        component: ComponentCreator('/Leetcoding/docs/category/two-pointers', '4dc'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/category/union-find',
        component: ComponentCreator('/Leetcoding/docs/category/union-find', 'c0e'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/dashboard',
        component: ComponentCreator('/Leetcoding/docs/dashboard', '2d3'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/DFS/num1',
        component: ComponentCreator('/Leetcoding/docs/DFS/num1', '764'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/dynamic-programing/num1',
        component: ComponentCreator('/Leetcoding/docs/dynamic-programing/num1', '7a9'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/hashtable/num1',
        component: ComponentCreator('/Leetcoding/docs/hashtable/num1', '438'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/linked-list/num1',
        component: ComponentCreator('/Leetcoding/docs/linked-list/num1', '8e3'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/math/num1',
        component: ComponentCreator('/Leetcoding/docs/math/num1', 'f44'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/segmant-tree/num1',
        component: ComponentCreator('/Leetcoding/docs/segmant-tree/num1', '185'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/sliding-window/num1',
        component: ComponentCreator('/Leetcoding/docs/sliding-window/num1', 'aea'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/sort/num1',
        component: ComponentCreator('/Leetcoding/docs/sort/num1', '2f1'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/stack/num1',
        component: ComponentCreator('/Leetcoding/docs/stack/num1', '8e1'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/string/merge-strings-alternately',
        component: ComponentCreator('/Leetcoding/docs/string/merge-strings-alternately', '319'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/tree/num1',
        component: ComponentCreator('/Leetcoding/docs/tree/num1', '9cc'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/two-pointers/num1',
        component: ComponentCreator('/Leetcoding/docs/two-pointers/num1', '78a'),
        exact: true,
        sidebar: "tutorialSidebar"
      },
      {
        path: '/Leetcoding/docs/union-find/num1',
        component: ComponentCreator('/Leetcoding/docs/union-find/num1', 'e43'),
        exact: true,
        sidebar: "tutorialSidebar"
      }
    ]
  },
  {
    path: '/Leetcoding/',
    component: ComponentCreator('/Leetcoding/', '392'),
    exact: true
  },
  {
    path: '*',
    component: ComponentCreator('*'),
  },
];
