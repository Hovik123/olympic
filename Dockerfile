# Use an official Node.js runtime as a parent image
FROM node:lts

# Set the working directory to /app
WORKDIR /app

# Copy package.json and package-lock.json to the working directory
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the entire project to the working directory
COPY . .

# Build the project
RUN npm run nx build frontend

CMD ["npm", "run", "serve"]
