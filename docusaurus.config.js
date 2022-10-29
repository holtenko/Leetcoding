// @ts-check
// Note: type annotations allow type checking and IDEs autocompletion

const lightCodeTheme = require("prism-react-renderer/themes/github");
const darkCodeTheme = require("prism-react-renderer/themes/dracula");

/** @type {import('@docusaurus/types').Config} */
const config = {
  title: "Holten",
  tagline: "Dinosaurs are cool",
  url: "http://holtenko.github.io/Leetcoding",
  baseUrl: "/",
  onBrokenLinks: "warn",
  onBrokenMarkdownLinks: "warn",
  favicon: "img/favicon.ico",

  // GitHub pages deployment config.
  // If you aren't using GitHub pages, you don't need these.
  organizationName: "facebook", // Usually your GitHub org/user name.
  projectName: "docusaurus", // Usually your repo name.

  // Even if you don't use internalization, you can use this field to set useful
  // metadata like html lang. For example, if your site is Chinese, you may want
  // to replace "en" with "zh-Hans".
  i18n: {
    defaultLocale: "en",
    locales: ["en"],
  },

  presets: [
    [
      "classic",
      /** @type {import('@docusaurus/preset-classic').Options} */
      ({
        docs: {
          sidebarPath: require.resolve("./sidebars.js"),
          // Please change this to your repo.
          // Remove this to remove the "edit this page" links.
          editUrl:
            "https://github.com/facebook/docusaurus/tree/main/packages/create-docusaurus/templates/shared/",
        },
        blog: {
          showReadingTime: true,
          // Please change this to your repo.
          // Remove this to remove the "edit this page" links.
          editUrl:
            "https://github.com/facebook/docusaurus/tree/main/packages/create-docusaurus/templates/shared/",
        },
        theme: {
          customCss: require.resolve("./src/css/custom.css"),
        },
      }),
    ],
  ],

  themeConfig:
    /** @type {import('@docusaurus/preset-classic').ThemeConfig} */
    ({
      navbar: {
        title: "Holten",
        logo: {
          alt: "My Site Logo",
          src: "img/logo.svg",
        },
        items: [
          {
            href: "https://holtenko.github.io/",
            label: "Home",
            position: "left",
          },
          {
            href: "https://holtenko.github.io/blog/",
            label: "Blog",
            position: "left",
          },
          {
            href: "https://github.com/holtenko/Leetcoding",
            label: "GitHub",
            position: "right",
          },
        ],
      },
      footer: {
        style: "dark",
        links: [
          {
            title: "Docs",
            items: [
              {
                label: "Leetcode",
                to: "/docs/dashboard",
              },
            ],
          },
          {
            title: "Social",
            items: [
              {
                label: "Stack Overflow",
                href: "https://stackoverflow.com/users/6351396/holten",
              },
              {
                label: "Zhihu",
                href: "https://www.zhihu.com/people/holten",
              },
              {
                label: "Wechat",
                to: "/blog/welcome",
              },
            ],
          },
          {
            title: "More",
            items: [
              {
                label: "Blog",
                href: "https://holtenko.github.io/blog/",
              },
              {
                label: "GitHub",
                href: "https://github.com/holtenko/Leetcoding",
              },
            ],
          },
        ],
        copyright: `Copyright © ${new Date().getFullYear()} Holten, Inc.`,
      },
      prism: {
        theme: lightCodeTheme,
        darkTheme: darkCodeTheme,
      },
      tableOfContents: {
        minHeadingLevel: 2,
        maxHeadingLevel: 5,
      },
    }),
};

module.exports = config;
