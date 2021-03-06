const ESLintPlugin = require('eslint-webpack-plugin');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const CssMinimizerPlugin = require('css-minimizer-webpack-plugin');
const TerserPlugin = require("terser-webpack-plugin");

module.exports = {
    target: ['es5'],
    entry: {
        isyweb: [
            './src/main/js/main.js',
            './src/main/css/specialcharpicker.css'
        ]
    },
    // js bundle
    output: {
        filename: '[name].bundle.js',
        path: __dirname + '/target/classes/META-INF/resources/js'
    },
    // config for css minimization
    module: {
        rules: [
            {
                test: /\.css$/i,
                use: [MiniCssExtractPlugin.loader, 'css-loader'],
            },
        ],
    },
    optimization: {
        minimizer: [
            new TerserPlugin({
                terserOptions: {
                    ecma: 5
                },
            }),
            new CssMinimizerPlugin(),
        ],
    },
    plugins: [new ESLintPlugin(), new MiniCssExtractPlugin({
        filename: "../css/[name].css"
    })]
};