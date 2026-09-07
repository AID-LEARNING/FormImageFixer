# FormImagesFix

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![PowerNukkitX](https://img.shields.io/badge/PowerNukkitX-Supported-brightgreen.svg)](https://powernukkitx.com/)

**FormImagesFix** is a lightweight plugin for **PowerNukkitX** servers that resolves the annoying issue of form button icons (`type: "url"`) taking too long to load or getting stuck indefinitely on the loading animation.

> **Note:** This project is a PowerNukkitX port of the original plugin created by **Muqsit**.

---

## 💡 The Problem

On Minecraft Bedrock Edition, when custom forms use remote URL-based images for button icons, the client often takes a significant amount of time to display them, leaving players staring at a persistent and blocking loading animation.

## 🛠️ The Solution

This plugin intercepts when a form is sent and instantly triggers an experience level update for the player. This technical workaround forces the client to refresh its user interface, immediately eliminating the loading animation and allowing the images to display smoothly.

---

## ✨ Features

- **Automatic Fix:** Resolves the infinite loading bug for form images (`url`).
- **Seamless & Instant:** Does not disrupt gameplay and does not visually alter the player's actual experience levels.
- **Lightweight:** Designed to have zero impact on server performance.
- **PowerNukkitX Ready:** Fully ported and optimized for the PowerNukkitX software.

---

## 📥 Installation

1. Download the latest version of the plugin from the [Releases](https://github.com/AID-LEARNING/FormImageFixer/releases) page.
2. Drop the plugin file into your server's `plugins` folder.
3. Restart or reload your server.

---

## ⚙️ Usage

Plug and play! No complex configuration is required. The plugin runs autonomously out of the box for all forms sent to players.

---

## 💖 Credits

- **[Muqsit](https://github.com/muqsit):** For the original concept and the initial version of the plugin.
- Ported to PowerNukkitX by [AID-LEARNING].

---

## 🤖 AI Usage

Please note that the use of Artificial Intelligence in this repository is strictly limited to generating this **README** file and writing **commit messages**. All core code, logic, and porting efforts were done manually.

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the issues page or submit a Pull Request if you want to contribute.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).