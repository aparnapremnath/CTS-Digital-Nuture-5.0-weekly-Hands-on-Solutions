# Week 05 Solutions

## 📄 Overview

This folder contains solutions for Week 05 assignments covering React fundamentals — component setup, class and function components, lifecycle methods, styling, JSX, events, and conditional rendering.

## 📁 Files

| Exercise | Folder | Description |
|----------|--------|--------------|
| 01 | 01)ReactSetup | Basic Create React App setup rendering a welcome heading |
| 02 | 02)StudentAppComponents | Class components (Home, About, Contact) composed in App.js |
| 03 | 03)ScoreCalculatorApp | Function component with props and CSS stylesheet styling |
| 04 | 04)BlogAppLifecycle | Lifecycle methods (componentDidMount, componentDidCatch) fetching JSONPlaceholder API data |
| 05 | 05)CohortDashboardStyling | CSS Modules with conditional heading colors based on cohort status |
| 06 | 06)CricketAppES6 | ES6 features - map, arrow-function filter, destructuring, spread operator |
| 07 | 07)OfficeSpaceRentalAppJSX | JSX fundamentals - elements, attributes, list rendering, conditional inline styling |
| 08 | 08)EventExamplesApp | Event handling - multi-handler clicks, argument passing, synthetic events, form submission |
| 09 | 09)TicketBookingAppConditional | Conditional rendering toggling Guest/User views via Login/Logout |
| 10 | 10)BloggerAppConditionalRendering | Multiple conditional rendering techniques (if/else, ternary, logical AND) across 3 components |

## 🛠 Tech Stack

- React 18
- JavaScript ES6
- Create React App
- CSS / CSS Modules
- Node.js
- npm

## 🔍 Notes

- `create-react-app` project names must be lowercase due to npm naming restrictions
- CSS Modules (`*.module.css`) used in Exercise 05 for scoped, conflict-free component styling
- `componentDidMount()` used for API calls on mount; `componentDidCatch()` used for error boundary handling in Exercise 04
- Spread operator (`...`) used to merge arrays without mutating originals in Exercise 06
- Conditional rendering demonstrated via if/else, ternary operator, and logical `&&` across Exercises 09 and 10
