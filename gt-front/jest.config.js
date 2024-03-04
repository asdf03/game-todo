module.exports = {
    moduleFileExtensions: ['js', 'json', 'vue'],
    transform: {
        '^.+\\.vue$': '@vue/vue3-jest',
        '^.+\\.js$': 'babel-jest'
    },
    collectCoverage: true,
    collectCoverageFrom: ['<rootDir>/src/**/*.{js,vue}', '!<rootDir>/node_modules/'],
    testMatch: ['<rootDir>/tests/unit/**/*.spec.js'],
    testPathIgnorePatterns: ['/node_modules/'],
    moduleNameMapper: {
        "^@/(.*)$": "<rootDir>/src/$1"
    },
    testEnvironment: 'jest-environment-jsdom',
};
