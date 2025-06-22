require("dotenv").config();
require("@nomiclabs/hardhat-ethers");
const { d5838f05c2f6c2a9efe6794a35fba5f1670ac6e941c7588c9a53d3c9f2839b9e } = process.env;
module.exports = {
  solidity: "0.8.9",
  defaultNetwork: "sepolia",
  networks: {
    hardhat: {},
    sepolia: {
      url: "<https://eth-sepolia.g.alchemy.com/v2/QR62JFlp3v3yYvbOtKgAZlg4NYlStB1X>",
      accounts: [`0x${d5838f05c2f6c2a9efe6794a35fba5f1670ac6e941c7588c9a53d3c9f2839b9e}`],
    },
  },
};
